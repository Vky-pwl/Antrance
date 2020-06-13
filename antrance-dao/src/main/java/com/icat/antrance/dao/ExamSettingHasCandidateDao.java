/**
 * 
 */
package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.ExamSettingHasCandidate;


public interface ExamSettingHasCandidateDao extends GenericDao<ExamSettingHasCandidate,Integer>{

	public String findAllByExamIdAndUserId = "from com.icat.antrance.model.ExamSettingHasCandidate examSettingHasCandidate where examSettingHasCandidate.examId=:_1_examId and examSettingHasCandidate.active=:_2_active and examSettingHasCandidate.candidateId = :_3_candidateId order by examSettingHasCandidateId desc ";
	
	public String findAllByExamIdUserIdAndSettingId = "from com.icat.antrance.model.ExamSettingHasCandidate examSettingHasCandidate where examSettingHasCandidate.examId=:_1_examId and examSettingHasCandidate.settingId=:_2_settingId and examSettingHasCandidate.candidateId = :_3_candidateId";
	
}
