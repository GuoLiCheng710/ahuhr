package com.dhf.ahuhr.exception;

public class CaseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CaseException() {
		
	}

	public CaseException(String message) {
		super(message);
		
	}

	public CaseException(Throwable cause) {
		super(cause);
		
	}

	public CaseException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
