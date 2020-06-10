package com.icat.antrance.user.service;

import java.util.Map;

import com.icat.antrance.common.vo.CandidateVo;

public interface CandidateCompositeService {

	Map<String, Object> signupCandidateComposite(CandidateVo candidateVo) throws Exception;

	Map<String, Object> attachExam(String testConductorLicenseCode, Integer userId) throws Exception;

}
