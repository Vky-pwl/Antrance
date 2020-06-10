/**
 * 
 */
package com.icat.antrance.dao.user.service;

import java.util.List;
import java.util.Map;

import com.icat.antrance.common.utils.ResponseBuilder;
import com.icat.antrance.common.vo.CandidateVo;

public interface CandidateService {

	Integer updateCandidate(CandidateVo candidateVo, Integer userId) throws Exception;

	CandidateVo readCandidate(Integer candidateId) throws Exception;

	Map<String, Object> listCandidate(Integer pageNo, Integer pageSize, String searchKey, Boolean active,
			Integer userId, Integer collegeId, Integer testConductorLicenseId, Integer testConductorId) throws Exception;

	ResponseBuilder createBatchCandidate(List<CandidateVo> candidateVoList, Integer userId, Integer collegeId);

	Map<String,Object> createCandidate(CandidateVo candidateVo, Integer userId);

}
