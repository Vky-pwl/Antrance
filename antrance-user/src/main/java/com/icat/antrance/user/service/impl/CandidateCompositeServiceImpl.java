package com.icat.antrance.user.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icat.antrance.common.utils.Constants;
import com.icat.antrance.common.vo.CandidateVo;
import com.icat.antrance.common.vo.CollegeVo;
import com.icat.antrance.dao.PublishExamLicenseDao;
import com.icat.antrance.dao.user.service.CandidateService;
import com.icat.antrance.model.PublishExamLicense;
import com.icat.antrance.model.TestConductor;
import com.icat.antrance.service.TestConductorHasTestCodeService;
import com.icat.antrance.user.service.CandidateCompositeService;
import com.icat.antrance.utils.TinyLinkService;

@Component
public class CandidateCompositeServiceImpl implements CandidateCompositeService {

    @Autowired
    private CandidateService candidateService;
    @Autowired
    private PublishExamLicenseDao publishExamLicenseDao;
    @Autowired
    private TestConductorHasTestCodeService testConductorHasTestCodeService;
    @Autowired
    private TinyLinkService tinyLinkService;


    private static final Logger LOGGER = LoggerFactory.getLogger(CandidateCompositeServiceImpl.class);

    @Override
    public Map<String, Object> attachExam(String testConductorLicenseCode, Integer userId) throws Exception {
        Map<String, Object> response = new HashMap<>();
        Map<String, Object> param = new HashMap<>();
        param.put("_1_code", testConductorLicenseCode);
        List<PublishExamLicense> publishExamLicenses = publishExamLicenseDao
                .listEntityByParameter(PublishExamLicenseDao.findByTCLCode, param, null, null);
        if (publishExamLicenses != null && publishExamLicenses.size() > 0) {
            PublishExamLicense publishExamLicense = publishExamLicenses.get(0);
            if (publishExamLicense.getEndTime().after(new Date())) {
                List<Integer> userIdList = new ArrayList<>();
                userIdList.add(userId);
                String tinyKey = null;
                Map<Integer, String> userIdTinyKeyMap = testConductorHasTestCodeService.assignedUserTestCode(userIdList,
                        publishExamLicense.getTestConductorLicense().getTestConductorLicenseId(), userId, false,
                        tinyKey);
                if (tinyKey == null) {
                    if(userIdTinyKeyMap.size()==1){
                        tinyKey =  userIdTinyKeyMap.get(userId);
                    }else{
                        LOGGER.info("Already Assigned exam");
                        response.put(Constants.STATUS_ERROR, "Already Assigned exam");
                        return response;
                    }
                }
                response.put(Constants.STATUS_SUCCESS, Constants.STATUS_SUCCESS);
                response.put("tinyKey", tinyKey);
                response.put("examId", publishExamLicense.getTestConductorLicense().getExam().getExamId());
            }
        }

        return response;

    }

    @Override
    public Map<String, Object> signupCandidateComposite(CandidateVo candidateVo) throws Exception {
        // Candidate, ExamLicense,
        Map<String, Object> response = new HashMap<>();
        if (candidateVo.getTestConductorLicenseCode() == null) {
            LOGGER.info("TestConductorLicenseCode should not be null: ");
            response.put(Constants.STATUS_ERROR, "TestConductorLicenseCode should not be null");
            return response;
        }

        Map<String, Object> param = new HashMap<>();
        param.put("_1_code", candidateVo.getTestConductorLicenseCode());
        List<PublishExamLicense> publishExamLicenses = publishExamLicenseDao
                .listEntityByParameter(PublishExamLicenseDao.findByTCLCode, param, null, null);
        if (publishExamLicenses != null && publishExamLicenses.size() > 0) {
            PublishExamLicense publishExamLicense = publishExamLicenses.get(0);
            if (publishExamLicense.getEndTime().after(new Date())) {
                TestConductor testConductor = publishExamLicense.getTestConductorLicense().getTestConductor();
                if (testConductor.getCollege() != null) {
                    candidateVo.setCollegeVo(new CollegeVo(testConductor.getCollege().getCollegeId()));
                }
                Map<String, Object> candidateResponse = candidateService.createCandidate(candidateVo, testConductor.getTestConductorId());
                if (candidateResponse.containsKey(Constants.STATUS_ERROR)) {
                    LOGGER.info("CandidateCreate getting error");
                    response.put(Constants.STATUS_ERROR, "CandidateCreate getting error");
                    return response;
                }
                List<Integer> userIdList = new ArrayList<>();
                Integer userId = (Integer) candidateResponse.get(Constants.STATUS_SUCCESS);
                userIdList.add(userId);
                String tinyKey = null;
                Map<Integer,String> testCodeTinyKeyMap =
                        testConductorHasTestCodeService.assignedUserTestCode(userIdList,
                        publishExamLicense.getTestConductorLicense().getTestConductorLicenseId(), userId, false,
                        tinyKey);
                if (tinyKey == null && testCodeTinyKeyMap.size() == 0) {
                    LOGGER.info("Already Assigned exam");
                    response.put(Constants.STATUS_ERROR, "Already Assigned exam");
                    return response;
                } else {
                    tinyKey = testCodeTinyKeyMap.get(userId);
                }
                response.put(Constants.STATUS_SUCCESS, Constants.STATUS_SUCCESS);
                response.put("tinyKey", tinyKey);
                response.put("examId", publishExamLicense.getTestConductorLicense().getExam().getExamId());

            }
        }
        return response;
    }
}
