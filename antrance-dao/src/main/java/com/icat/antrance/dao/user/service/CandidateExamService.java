package com.icat.antrance.dao.user.service;

import java.util.Map;

import com.icat.antrance.common.vo.CandidateExamVo;
import com.icat.antrance.common.vo.ExamMetadatDashboardVo;
import com.icat.antrance.common.vo.UserType;

public interface CandidateExamService {

	Long createCandidateExam(CandidateExamVo candidateExamVo) throws Exception;

	Map<String, Object> getExamListByCandidateId(Integer userId, Integer pageNo, Integer pageSize, Boolean attended, UserType userType);

	ExamMetadatDashboardVo getExamMetadatDashboardVo(Integer candidateId);

}
