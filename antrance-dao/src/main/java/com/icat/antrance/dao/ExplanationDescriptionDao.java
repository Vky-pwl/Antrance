/**
 * 
 */
package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.ExplanationDescription;

/**
 * @author satyendra 
 *
 */
public interface ExplanationDescriptionDao extends GenericDao<ExplanationDescription,Integer>{

	
	public String findAll = "from com.icat.antrance.model.ExplanationDescription explanationDescription order by explanationDescription.explanationDescriptionId desc";
	public String findAllByQuestionId = "from com.icat.antrance.model.ExplanationDescription explanationDescription where explanationDescription.questionId=:_1_questionId";
		
}
