package com.icat.antrance.admin.service;

import java.util.Map;

import com.icat.antrance.common.vo.QuestionBankVo;
import com.icat.antrance.model.QuestionBank;

public interface QuestionBankService {

	Integer createQuestionBank(QuestionBankVo questionBankVo,Integer userId);

	Integer updateQuestionBank(QuestionBankVo questionBankVo,Integer userId) throws Exception;

	QuestionBankVo readQuestionBank(Integer questionBankId,Integer userId) throws Exception;

	QuestionBank transformQuestionBank(QuestionBankVo questionBankVo, Integer userId);

	Map<String, Object> listQuestionBank(Integer pageNo, Integer pageSize, String searchKey, Boolean active,
			Integer userId, Integer questionCategoryId, Integer questionSubCategoryId, Integer questionExamType) throws Exception;

}
