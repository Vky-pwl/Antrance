
package com.icat.antrance.common.exception;

import com.icat.antrance.common.utils.Constants;

public class SecurityUserException extends RuntimeException {

	private static final long	serialVersionUID	= 9091522463557394692L;

	public SecurityUserException(String applicationMessage, String platformMessage, String userMessage, String className) {

		super(applicationMessage + Constants.EXCEPTION_MESSAGE_SEPERATOR + platformMessage + Constants.EXCEPTION_MESSAGE_SEPERATOR + userMessage
				+ Constants.EXCEPTION_MESSAGE_SEPERATOR + className);
	}

}
