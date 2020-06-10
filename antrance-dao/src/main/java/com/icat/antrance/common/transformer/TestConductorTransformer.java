package com.icat.antrance.common.transformer;

import com.icat.antrance.common.vo.TestConductorVo;
import com.icat.antrance.model.TestConductor;

public class TestConductorTransformer implements Transformer<TestConductor, TestConductorVo> {

	@Override
	public TestConductorVo transform(TestConductor testConductor) {
		if (testConductor == null) {
			return null;
		}
		TestConductorVo testConductorVo = new TestConductorVo();
		testConductorVo.setTestConductorId(testConductor.getTestConductorId());
		testConductorVo.setActive(testConductor.getActive());
		testConductorVo.setFirstName(testConductor.getFirstName());
		testConductorVo.setLastName(testConductor.getLastName());
		testConductorVo.setContactEmail(testConductor.getContactEmail());
		testConductorVo.setAdminType(testConductor.getAdminType());
		testConductorVo.setParentTestConductorId(testConductor.getParentTestConductorId());
		testConductorVo.setCollegeVo(Transformer.COLLEGE_TRANSFORMER.transform(testConductor.getCollege()));
		return testConductorVo;
	}

}
