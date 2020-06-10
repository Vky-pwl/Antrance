package com.icat.antrance.service.impl;

import java.util.Map;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;

import com.icat.antrance.dao.TestConductorHasTestCodeDao;


public class ExamResultServiceImplTest {
    @Autowired
    TestConductorHasTestCodeDao testConductorHasTestCodeDao;

    @InjectMocks
    private ExamResultServiceImpl examResultServiceImpl = new ExamResultServiceImpl();

    @Ignore
    @Test
    public void testGetResultsByExamId(){
        Map<String, Object> result = examResultServiceImpl.getResultsByExamId(
                4, 1, 100, null, null, null, null);
        result.forEach((key,value)->{
            System.out.println("Key"+ key);
            System.out.println("Value"+ value);
        });
        System.out.println("result" + result.toString());
        Assert.assertTrue(true);
    }

}
