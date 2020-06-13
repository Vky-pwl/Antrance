/**
 * 
 */
package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.ExamSetting;


public interface ExamSettingDao extends GenericDao<ExamSetting,Integer>{

	public String findAllByExamId = "from com.icat.antrance.model.ExamSetting examSetting where examSetting.examId=:_1_examId order by examSettingId desc ";
	public String findAllActiveByExamId = "from com.icat.antrance.model.ExamSetting examSetting where examSetting.examId=:_1_examId and examSetting.active = true  order by examSettingId desc ";
	public String findAllByExamIdAndSettingId = "from com.icat.antrance.model.ExamSetting examSetting where examSetting.examId=:_1_examId and examSetting.settingId=:_2_settingId";
	
}
