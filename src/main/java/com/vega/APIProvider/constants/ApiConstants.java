package com.vega.APIProvider.constants;


public class ApiConstants {
	
	public static final int CUST_EXIST=1;
	public static final int CUST_NOT_EXIST= -1;
	public static final int CUSTCODE_NOT_EXIST=-4;
	public static final int CUST_CUSTCODE_ERR = -5;
	public static final int CONVENTION_NOT_ACTIVE=-6;
	
	public static final String TOKEN_VALIDATE = "http://localhost:8080/el-api-token/v1/token/validate/";
	public static final String AUTHORIZATION = "Authorization";
	public static final String BEARER = "Bearer";
	public static final String TOKEN_VALID_REQ = "1";
	public static final int TOKEN_VALID = 1;
	public static final int TOKEN_EXPIRED = 402;
	public static final int TOKEN_NOT_AUTHORIZED = -10;
	public static final int TOKEN_MISSING = -20;
	public static final int TOKEN_INVALID = 0;
	public static final String MR = "Mr";
	public static final int MR_INT = 1;
	
	public static final String MLLE = "Mlle";
	public static final int MLLE_INT = -1;
	
	public static final String MME = "Mme";
	public static final int MME_INT = -2;
	
	public static final int PROVIDER_ROOT_DELETED=1;
	
	public static final String PATH_FILE = "//usr//easylink//documents//";
	
	public static final int CATCH_ERROR=-10;
	
	public static final int UPLOADED=1;
	
	public static final int TRANSACTION_VALID=21;
	
}

