
package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.PublishExamLicense;


public interface PublishExamLicenseDao extends GenericDao<PublishExamLicense,Integer>{

	public String findByTCLCode="from com.icat.antrance.model.PublishExamLicense publishExamLicense where publishExamLicense.active is true and publishExamLicense.testConductorLicenseCode=:_1_code";
	
	public String findByTCLId="from com.icat.antrance.model.PublishExamLicense publishExamLicense where publishExamLicense.active is true and publishExamLicense.testConductorLicense.testConductorLicenseId=:_1_TCLId and active is true";
	
	
}
