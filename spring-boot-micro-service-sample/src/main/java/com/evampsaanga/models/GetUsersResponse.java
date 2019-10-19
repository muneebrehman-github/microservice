package com.evampsaanga.models;

public class GetUsersResponse extends BaseResponse {

    GetUsersResponseData data;

    public GetUsersResponseData getData() {
	return data;
    }

    public void setData(GetUsersResponseData data) {
	this.data = data;
    }

    @Override
    public String toString() {
	return "GetUsers [data=" + data + ", toString()=" + super.toString() + "]";
    }

}
