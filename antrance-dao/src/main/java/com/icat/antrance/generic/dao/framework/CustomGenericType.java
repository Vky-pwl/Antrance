package com.icat.antrance.generic.dao.framework;

import java.util.List;

public interface CustomGenericType<T> {

	T converter(Object[] objArray, List<String> excludedFieldNames);
	
	
}
