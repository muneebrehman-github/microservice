package com.evampsaanga.models;

public class BaseResponse {
    int responseCode;
    String responseDesc;

    public BaseResponse() {
	super();
    }

    public BaseResponse(int responseCode, String responseDesc) {
	this.responseCode = responseCode;
	this.responseDesc = responseDesc;
    }

    public int getResponseCode() {
	return responseCode;
    }

    public void setResponseCode(int responseCode) {
	this.responseCode = responseCode;
    }

    public String getResponseDesc() {
	return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
	this.responseDesc = responseDesc;
    }

    @Override
    public String toString() {
	return "BaseResponse [responseCode=" + responseCode + ", responseDesc=" + responseDesc + ", toString()="
		+ super.toString() + "]";
    }

}
