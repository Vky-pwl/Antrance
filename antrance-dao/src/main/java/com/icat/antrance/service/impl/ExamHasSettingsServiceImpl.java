package com.icat.antrance.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icat.antrance.common.transformer.Transformer;
import com.icat.antrance.common.vo.ExamSettingsVo;
import com.icat.antrance.common.vo.QuestionDisplay;
import com.icat.antrance.dao.ExamDao;
import com.icat.antrance.dao.ExamHasSettingsDao;
import com.icat.antrance.model.Exam;
import com.icat.antrance.model.ExamHasSettings;
import com.icat.antrance.service.ExamHasSettingsService;

@Service
public class ExamHasSettingsServiceImpl implements ExamHasSettingsService {

	@Autowired
	private ExamHasSettingsDao examHasSettingsDao;
	@Autowired
	private ExamDao examDao;
	private static final Logger LOGGER = LoggerFactory.getLogger(ExamHasSettingsServiceImpl.class);

	@Override
	public Integer createExamSetting(ExamSettingsVo examSettingsVo, Integer loggedUserId) {
		Integer id = null;
		if (examSettingsVo.getExamId() == null) {
			LOGGER.warn("examId should not be null");
			return null;
		}

		ExamHasSettings examHasSettings = new ExamHasSettings(examSettingsVo.getAllowBackButton(),
				examSettingsVo.getReattemptCount(), examSettingsVo.getAllowExamResume(),
				examSettingsVo.getAllowExamResumeCount(), QuestionDisplay.valueOf(examSettingsVo.getDisplayQuestion()),
				examSettingsVo.getAllowBackButton(), examSettingsVo.getPrivacy(), true, new Date(),
				new Long(loggedUserId), new Date(), new Long(loggedUserId));
		id = examHasSettingsDao.create(examHasSettings);
		if (id != null) {
			Exam exam = examDao.read(examSettingsVo.getExamId());
			exam.setExamHasSettings(examHasSettings);
			exam.setLastModified(new Date());
			exam.setLastModifiedBy(new Long(loggedUserId));
			examDao.update(exam);
		}
		return id;
	}

	@Override
	public ExamHasSettings createSetting(ExamSettingsVo examSettingsVo, Integer loggedUserId) {
	
		ExamHasSettings examHasSettings = new ExamHasSettings(examSettingsVo.getAllowBackButton(),
				examSettingsVo.getReattemptCount(), examSettingsVo.getAllowExamResume(),
				examSettingsVo.getAllowExamResumeCount(), QuestionDisplay.valueOf(examSettingsVo.getDisplayQuestion()),
				examSettingsVo.getAllowBackButton(), examSettingsVo.getPrivacy(), true, new Date(),
				new Long(loggedUserId), new Date(), new Long(loggedUserId));
		examHasSettingsDao.create(examHasSettings);
		return examHasSettings;
	}

	@Override
	public void updateExamSetting(ExamSettingsVo examSettingsVo, Integer loggedUserId) {

		if ( examSettingsVo.getExamSettingId() == null) {
			LOGGER.error("ExamSettingId should not be null");
			return;
		}

		ExamHasSettings examHasSettings = examHasSettingsDao.read(examSettingsVo.getExamSettingId());
		examHasSettings.setAllowBackButton(examSettingsVo.getAllowBackButton());
		examHasSettings.setAllowExamResume(examSettingsVo.getAllowExamResume());
		examHasSettings.setAllowExamResumeCount(examSettingsVo.getAllowExamResumeCount());
		examHasSettings.setAllowReattempts(examSettingsVo.getAllowReattempts());
		examHasSettings.setPrivacy(examSettingsVo.getPrivacy());
		examHasSettings.setLastModified(new Date());
		examHasSettings.setLastModifiedBy(new Long(loggedUserId));
		examHasSettings.setActive(examSettingsVo.getActive());
		examHasSettings.setDisplayQuestion(QuestionDisplay.valueOf(examSettingsVo.getDisplayQuestion()));
		examHasSettings.setReattemptCount(examSettingsVo.getReattemptCount());
		examHasSettingsDao.update(examHasSettings);

	}

	@Override
	public List<ExamSettingsVo> listExamSettings() {

		List<ExamSettingsVo> examSettingsVos = new ArrayList<>();

		List<ExamHasSettings> examHasSettings = examHasSettingsDao.listEntity(ExamHasSettingsDao.findAll);
		examHasSettings.stream().forEach(examHasSetting -> {
			examSettingsVos.add(Transformer.EXAM_HAS_SETTING_TRANSFORMER.transform(examHasSetting));
		});
		return examSettingsVos;
	}

}
