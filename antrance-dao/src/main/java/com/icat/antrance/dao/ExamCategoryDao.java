/**
 * 
 */
package com.icat.antrance.dao;

import com.icat.antrance.generic.dao.framework.GenericDao;
import com.icat.antrance.model.ExamCategory;

/**
 * @author satyendra 
 *
 */
public interface ExamCategoryDao extends GenericDao<ExamCategory,Integer>{

	public String findAllBySearchKeyWithFilter="from com.icat.antrance.model.ExamCategory examCategory where "
			+ "examCategory.active =:_1_active and examCategory.examCategoryName like :_2_categoryName and examCategory.parentExamCategoryId is null order by examCategory.examCategoryId desc";
	public String findAllByFilter="from com.icat.antrance.model.ExamCategory examCategory where examCategory.active =:_1_active  and examCategory.parentExamCategoryId is null order by examCategory.examCategoryId desc";
	public String findAllBySearchKey="from com.icat.antrance.model.ExamCategory examCategory where examCategory.examCategoryName like :_2_categoryName   and examCategory.parentExamCategoryId is null order by examCategory.examCategoryId desc";
	public String findAll = "from com.icat.antrance.model.ExamCategory examCategory   where examCategory.parentExamCategoryId is null order by examCategory.examCategoryId desc";
	public String findAllByParentId = "from com.icat.antrance.model.ExamCategory examCategory  where examCategory.parentExamCategoryId= :_1_parentExamCateogryId order by examCategory.examCategoryId desc";
	
	public String findAllSubCategoryBySearchKeyWithFilter="from com.icat.antrance.model.ExamCategory examCategory where "
			+ "examCategory.active =:_1_active and examCategory.examCategoryName like :_2_categoryName and examCategory.parentExamCategoryId is not null order by examCategory.examCategoryId desc";
	public String findAllSubCategoryByFilter="from com.icat.antrance.model.ExamCategory examCategory where examCategory.active =:_1_active  and examCategory.parentExamCategoryId is not null order by examCategory.examCategoryId desc";
	public String findAllSubCategoryBySearchKey="from com.icat.antrance.model.ExamCategory examCategory where examCategory.examCategoryName like :_2_categoryName   and examCategory.parentExamCategoryId is not null order by examCategory.examCategoryId desc";
	public String findAllSubCategory = "from com.icat.antrance.model.ExamCategory examCategory   where examCategory.parentExamCategoryId is not null order by examCategory.examCategoryId desc";
	
}
