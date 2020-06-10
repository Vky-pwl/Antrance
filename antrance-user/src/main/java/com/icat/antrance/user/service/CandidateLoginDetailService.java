package com.icat.antrance.user.service;

import java.util.Map;

public interface CandidateLoginDetailService {

	Map<String, Object> getCandidateLoginDetails(String token, Boolean flag);


}
