

package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.UserLogin;

public interface UserLoginDao extends GenericDao<UserLogin, Integer> {

	
	
		public static String findAllLogOffTimeNullByUserName= "from com.icat.antrance.model.UserLogin userLogin\n" + 
			"where userLogin.userId = :_1_userId and userLogin.userType=:_2_userType and userLogin.logoffTime is null order by id desc";

	
}
