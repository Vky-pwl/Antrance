/**
 * 
 */
package com.icat.antrance.admin.service;

import java.util.Map;

import com.icat.antrance.common.vo.PermissionVo;

/**
 * @author satyendra
 *
 */
public interface PermissionService {

	
	Integer updatePermission(PermissionVo permissionVo,Integer userId) throws Exception;

	PermissionVo readPermission(Integer permissionId,Integer userId) throws Exception;

	Map<String,Object> listPermission(Integer pageNo, Integer pageSize, String searchKey, Boolean active,Integer userId) throws Exception;

	Integer createPermission(PermissionVo permissionVo,Integer userId) throws Exception;

	
}
