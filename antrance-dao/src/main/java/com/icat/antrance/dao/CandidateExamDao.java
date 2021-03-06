package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.CandidateExam;

public interface CandidateExamDao extends GenericDao<CandidateExam, Long>{

	public String findByTCHTCIdAndQuestionId = "from com.icat.antrance.model.CandidateExam candidateExam where candidateExam.testConductorHasTestCodeId=:_1_TCHTCId and candidateExam.examSectionHasQuestionId=:_2_questionId ";

	public String findAllAttemptQuestion = "select distinct examSectionHasQuestionId from CandidateExam where examSectionHasQuestionId in(:_1_questionIdList) and active = true and candidateId = :_2_candidateId";
	
}
