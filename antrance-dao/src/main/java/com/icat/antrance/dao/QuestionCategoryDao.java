/**
 * 
 */
package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.QuestionCategory;


public interface QuestionCategoryDao extends GenericDao<QuestionCategory,Integer>{

	public String findAllBySearchKeyWithFilter="from com.icat.antrance.model.QuestionCategory questionCategory where "
			+ "questionCategory.active =:_1_active and questionCategory.questionCategoryName like :_2_categoryName and questionCategory.parentQuestionCategoryId is null order by questionCategory.questionCategoryId desc";
	public String findAllByFilter="from com.icat.antrance.model.QuestionCategory questionCategory where questionCategory.active =:_1_active and questionCategory.parentQuestionCategoryId is null  order by questionCategory.questionCategoryId desc";
	public String findAllBySearchKey="from com.icat.antrance.model.QuestionCategory questionCategory where questionCategory.questionCategoryName like :_2_categoryName and questionCategory.parentQuestionCategoryId is null order by questionCategory.questionCategoryId desc";
	public String findAll = "from com.icat.antrance.model.QuestionCategory questionCategory";
	public String findAllByParentId = "from com.icat.antrance.model.QuestionCategory questionCategory where  questionCategory.parentQuestionCategoryId =:_1_parentQuestionCateogryId order by questionCategory.questionCategoryId desc";
	
	public String findAllSubCategoryBySearchKeyWithFilter="from com.icat.antrance.model.QuestionCategory questionCategory where "
			+ "questionCategory.active =:_1_active and questionCategory.questionCategoryName like :_2_categoryName and questionCategory.parentQuestionCategoryId is not null order by questionCategory.questionCategoryId desc";
	public String findAllSubCategoryByFilter="from com.icat.antrance.model.QuestionCategory questionCategory where questionCategory.active =:_1_active and questionCategory.parentQuestionCategoryId is not null  order by questionCategory.questionCategoryId desc";
	public String findAllSubCategoryBySearchKey="from com.icat.antrance.model.QuestionCategory questionCategory where questionCategory.questionCategoryName like :_2_categoryName and questionCategory.parentQuestionCategoryId is not null order by questionCategory.questionCategoryId desc";
	public String findAllSubCategory = "from com.icat.antrance.model.QuestionCategory questionCategory where  questionCategory.parentQuestionCategoryId is not null order by questionCategory.questionCategoryId desc";
	
}
