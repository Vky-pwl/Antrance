package com.icat.antrance.dao.user.service;

import com.icat.antrance.common.vo.TestConductorHasTestCodeVo;

public interface TestConductorHasTestCodeUserService {

	TestConductorHasTestCodeVo getResultByExamId(Integer examId, Integer userId) throws Exception;

	void submitExam(Integer tchtcId, Integer userId);

}
