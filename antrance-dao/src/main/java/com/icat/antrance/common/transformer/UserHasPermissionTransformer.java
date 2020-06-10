package com.icat.antrance.common.transformer;

import com.icat.antrance.common.vo.UserHasPermissionVo;
import com.icat.antrance.model.UserHasPermission;

public class UserHasPermissionTransformer implements Transformer<UserHasPermission, UserHasPermissionVo> {

	@Override
	public UserHasPermissionVo transform(UserHasPermission userHasPermission) {
		if (userHasPermission == null) {
			return null;
		}
		UserHasPermissionVo userHasPermissionVo = new UserHasPermissionVo();
		userHasPermissionVo.setUserHasPermissionId(userHasPermission.getUserHasPermissionId());
		userHasPermissionVo.setPermissionId(userHasPermission.getPermission().getPermissionId());
		userHasPermissionVo.setPermissionName(userHasPermission.getPermission().getPermissionName());
		userHasPermissionVo.setExamId(userHasPermission.getExam().getExamId());
		userHasPermissionVo.setUserId(userHasPermission.getUserId());
		userHasPermissionVo.setUserType(userHasPermission.getUserType());
		userHasPermissionVo.setActive(userHasPermission.getActive());
		return userHasPermissionVo;
	}

}
