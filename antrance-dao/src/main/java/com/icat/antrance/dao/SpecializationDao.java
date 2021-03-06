/**
 * 
 */
package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.Specialization;

/**
 * @author satyendra
 *
 */
public interface SpecializationDao extends GenericDao<Specialization,Integer>{

		
	public String findAllBySearchKeyWithFilter="from com.icat.antrance.model.Specialization specialization where "
			+ "specialization.active =:_1_active and specialization.specializationName like :_2_specializationName order by specialization.specializationId desc";
	public String findAllByFilter="from com.icat.antrance.model.Specialization specialization where specialization.active =:_1_active order by specialization.specializationId desc";
	public String findAllBySearchKey="from com.icat.antrance.model.Specialization specialization where specialization.specializationName like :_2_specializationName order by specialization.specializationId desc";
	public String findAll = "from com.icat.antrance.model.Specialization specialization order by specialization.specializationId desc";

	
	
}
