package com.icat.antrance.admin.service;

import java.util.Map;

import com.icat.antrance.common.vo.ExplanationDescriptionVo;
import com.icat.antrance.model.ExplanationDescription;

public interface ExplanationDescriptionService {

	Integer createExplanationDescription(ExplanationDescriptionVo explanationDescriptionVo,Integer userId);

	Integer updateExplanationDescription(ExplanationDescriptionVo explanationDescriptionVo,Integer userId) throws Exception;

	ExplanationDescriptionVo readExplanationDescription(Integer explanationDescriptionId,Integer userId) throws Exception;


	ExplanationDescriptionVo readExplanationDescriptionByQuestionId(Integer questionId,Integer userId) throws Exception;

	Map<String, Object> listExplanationDescription(Integer pageNo, Integer pageSize,Integer userId) throws Exception;

	ExplanationDescription transformExplanationDesc(ExplanationDescriptionVo explanationDescriptionVo, Integer userId);


}
