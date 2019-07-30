package com.vega.APIProvider.service;

import com.vega.APIProvider.dto.TokenValidationOutput;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ahmed on 19/07/2019.
 */
public interface TokenValidationOutputService {
    public TokenValidationOutput getValidate(HttpServletRequest request);
}
