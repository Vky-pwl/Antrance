/**
 * 
 */
package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.CandidateQuestionStatus;


public interface CandidateQuestionStatusDao extends GenericDao<CandidateQuestionStatus,Long>{

	
	public String findByTCHTCIDAndQuesId="from com.icat.quest.model.CandidateQuestionStatus candidateQuestionStatus where candidateQuestionStatus.testConductorHasTestCodeId=:_1_testConductorHasTestCodeId and candidateQuestionStatus.examSectionHasQuestionId=:_2_questionId";

	public String findAllByTCHTCIDAndQIdList="from com.icat.quest.model.CandidateQuestionStatus candidateQuestionStatus where candidateQuestionStatus.testConductorHasTestCodeId=:_1_testConductorHasTestCodeId and candidateQuestionStatus.examSectionHasQuestionId in(:_2_qIdList)";
}
