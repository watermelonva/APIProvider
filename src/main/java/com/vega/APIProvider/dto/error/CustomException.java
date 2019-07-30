package com.vega.APIProvider.dto.error;

public class CustomException extends RuntimeException {

  private static final long serialVersionUID = 1L;


	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}  

}
