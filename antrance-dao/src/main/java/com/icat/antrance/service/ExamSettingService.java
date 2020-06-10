package com.icat.antrance.service;

import java.util.List;
import java.util.Map;

import com.icat.antrance.common.vo.ExamSettingVo;

public interface ExamSettingService {

	
	Map<String, Object> getListByExamId(Integer examId, Integer userId, int pageNo, int pageSize);

	List<Integer> createBatchExamSetting(ExamSettingVo examSettingVo, Integer userId) throws Exception;

	List<ExamSettingVo> getListExamId(Integer examId);

}
