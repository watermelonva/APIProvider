package com.vega.APIProvider.dto;

public class TokenValidationOutput {
	private int result;
	private String error_description;
	
	public TokenValidationOutput( ) {}

	public TokenValidationOutput(int result, String error_description ) {
		this.setResult(result);
		this.setError_description(error_description);
	}

	public String getError_description() {
		return error_description;
	}

	public void setError_description(String error_description) {
		this.error_description = error_description;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	

}
