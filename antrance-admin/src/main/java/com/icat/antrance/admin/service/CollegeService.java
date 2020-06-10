package com.icat.antrance.admin.service;

import java.util.Map;

import com.icat.antrance.common.vo.CollegeVo;

public interface CollegeService {

	Integer createCollege(CollegeVo collegeVo, Integer userId) throws Exception;

	Integer updateCollege(CollegeVo collegeVo,Integer userId) throws Exception;

	CollegeVo readCollege(Integer collegeId,Integer userId) throws Exception;

	Map<String,Object> listCollege(Integer pageNo, Integer pageSize, String searchKey, Boolean active,Integer userId) throws Exception;

}
