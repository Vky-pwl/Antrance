package com.icat.antrance.service;

import java.util.List;

import com.icat.antrance.common.vo.ExamSettingsVo;
import com.icat.antrance.model.ExamHasSettings;

public interface ExamHasSettingsService {

	Integer createExamSetting(ExamSettingsVo examSettingsVo, Integer loggedUserId);

	void updateExamSetting(ExamSettingsVo examSettingsVo, Integer loggedUserId);

	List<ExamSettingsVo> listExamSettings();

	ExamHasSettings createSetting(ExamSettingsVo examSettingsVo, Integer loggedUserId);

}
