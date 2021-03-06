package com.icat.antrance.scheduler.service.impl;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.icat.antrance.common.utils.SpringApplicationContext;
import com.icat.antrance.dao.user.service.ExamQuestionCacheService;

public class ExamQuestionCacheSchedulerJob extends QuartzJobBean implements Job {
	
	private ExamQuestionCacheService		examQuestionCacheService;
	private static final Logger LOGGER = LoggerFactory.getLogger(ExamQuestionCacheSchedulerJob.class);
	
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		if(examQuestionCacheService == null) {
		this.examQuestionCacheService = (ExamQuestionCacheService) SpringApplicationContext.getBean("examQuestionCacheService");
		}
		LOGGER.debug("Exam Question Cache Job: "+ new Date());
		if(examQuestionCacheService != null) {
		examQuestionCacheService.clearQuestionCacheJob();
		}
	}

}
