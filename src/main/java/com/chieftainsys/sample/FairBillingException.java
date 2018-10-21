package com.chieftainsys.sample;

/** 
 *	Always have our own unchecked exception class and handle at top 
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
