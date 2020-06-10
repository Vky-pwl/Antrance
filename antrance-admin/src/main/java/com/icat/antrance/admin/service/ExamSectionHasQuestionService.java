package com.icat.antrance.admin.service;

import java.util.List;
import java.util.Map;

import com.icat.antrance.common.vo.ExamSectionHasQuestionVo;

public interface ExamSectionHasQuestionService {

	Integer createExamSectionHasQuestion(ExamSectionHasQuestionVo examSectionHasQuestionVo,Integer userId) throws Exception;

	Integer updateExamSectionHasQuestion(ExamSectionHasQuestionVo examSectionHasQuestionVo,Integer userId) throws Exception;

	ExamSectionHasQuestionVo readExamSectionHasQuestion(Integer examSectionHasQuestionId,Integer userId) throws Exception;

	Map<String,Object> listExamSectionHasQuestion(Integer pageNo, Integer pageSize, String searchKey, Boolean active,Integer userId) throws Exception;

	 Map<String,Object> listExamSectionHasQuestionVoBySectionId(Integer examSectionId, Integer pageNo,
			Integer pageSize,Integer userId) throws Exception;

	void attachBatchExamSectionHasQuestion(List<ExamSectionHasQuestionVo> examSectionHasQuestionVos, Integer userId)
			throws Exception;


}
