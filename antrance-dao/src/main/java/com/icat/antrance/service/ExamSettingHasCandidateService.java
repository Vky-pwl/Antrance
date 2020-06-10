package com.icat.antrance.service;

import java.util.Map;

import com.icat.antrance.common.vo.ExamSettingHasCandidateVo;

public interface ExamSettingHasCandidateService {

	ExamSettingHasCandidateVo readExamSettingHasCandidate(Integer examSettingHasCandidateId, Integer userId) throws Exception;

	Integer updateExamSettingHasCandidate(ExamSettingHasCandidateVo examSettingHasCandidateVo, Integer userId) throws Exception;

	Integer craeteExamSettingHasCandidate(ExamSettingHasCandidateVo examSettingHasCandidateVo, Integer userId) throws Exception;

	Map<String, Object> getListByExamId(Integer examId, Integer userId, Boolean active, int pageNo, int pageSize);

}
