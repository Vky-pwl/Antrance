package com.icat.antrance.dao.user.service;

import java.util.List;

import com.icat.antrance.common.vo.CandidateQuestionStatusVo;

public interface CandidateQuestionStatusService {

	void update(CandidateQuestionStatusVo candidateQuestionStatusVo);

	List<CandidateQuestionStatusVo> getList(List<Integer> idList, Integer candidateId,
			Integer testConductorHasTestCodeId);

}
