package com.evampsaanga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.evampsaanga.dao.UserRepository;
import com.evampsaanga.models.GetUsersResponse;
import com.evampsaanga.models.GetUsersResponseData;
import com.evampsaanga.models.User;
import com.evampsaanga.utils.StatusCode;

@Component
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public GetUsersResponse getUsers() throws Exception {
	GetUsersResponse getUsersResponse = new GetUsersResponse();
	List<User> listUser = userRepository.findAll();
	GetUsersResponseData getUsersResponseData = new GetUsersResponseData();

	if (listUser.isEmpty()) {
	    getUsersResponse.setResponseCode(StatusCode.GENERAL_FAILURE_ERROR);
	    getUsersResponse.setResponseDesc("No data found");
	    getUsersResponse.setData(null);
	} else {
	    getUsersResponseData.setUser(listUser);
	    getUsersResponse.setResponseCode(StatusCode.SUCCESS_CODE);
	    getUsersResponse.setResponseDesc("Success");
	    getUsersResponse.setData(getUsersResponseData);
	}
	return getUsersResponse;
    }

    public User addUsers(User user) {

	return userRepository.save(user);
    }

}
