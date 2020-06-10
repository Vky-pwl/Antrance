
package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.ExamHasSettings;


public interface ExamHasSettingsDao extends GenericDao<ExamHasSettings,Integer>{
	
	public String findAll = "from com.icat.quest.model.ExamHasSettings examHasSettings where examHasSettings.active = true";

}
