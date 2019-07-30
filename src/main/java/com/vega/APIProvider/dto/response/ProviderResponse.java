package com.vega.APIProvider.dto.response;

public class ProviderResponse {

    private int result;
    private String errorDescription;
    private Object providerInfo;

    public ProviderResponse() {
    }

    public ProviderResponse(int result, String errorDescription, Object providerInfo) {
        this.result = result;
        this.errorDescription = errorDescription;
        this.providerInfo = providerInfo;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public Object getproviderInfo() {
        return providerInfo;
    }

    public void setproviderInfo(Object providerInfo) {
        this.providerInfo = providerInfo;
    }
}
