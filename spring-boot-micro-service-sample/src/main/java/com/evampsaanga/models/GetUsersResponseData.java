package com.evampsaanga.models;

import java.util.ArrayList;
import java.util.List;

public class GetUsersResponseData {

    List<User> user = null;

    public GetUsersResponseData() {
	this.user = new ArrayList<>();
    }

    public List<User> getUser() {
	return user;
    }

    public void setUser(List<User> user) {
	this.user = user;
    }

    @Override
    public String toString() {
	return "GetUsersResponseData [user=" + user + "]";
    }

}
