package com.chieftainsys.sample;

/** 
 *	Unchecked exception for all errors produced by the application.
 *  Application errors should always have an application-specific exception
 *  as reusing Java errors can make them hard to find in the logs. 
 */
@SuppressWarnings("serial")
public class FairBillingException extends RuntimeException {

	public FairBillingException() {
		super();
	}
	
	public FairBillingException(Exception e) {
		super(e);
	}

	public FairBillingException(String message, Exception e) {
		super(message, e);
	}
}
