/**
 * 
 */
package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.College;


public interface CollegeDao extends GenericDao<College,Integer>{

	
	public String findAllBySearchKeyWithFilter="from com.icat.antrance.model.College college where "
			+ "college.active =:_1_active and college.collegeName like :_2_collegeName order by college.collegeId desc";
	public String findAllByFilter="from com.icat.antrance.model.College college where college.active =:_1_active order by college.collegeId desc";
	public String findAllBySearchKey="from com.icat.antrance.model.College college where college.collegeName like :_2_collegeName order by college.collegeId desc";
	public String findAll = "from com.icat.antrance.model.College college order by college.collegeId desc";
	
}
