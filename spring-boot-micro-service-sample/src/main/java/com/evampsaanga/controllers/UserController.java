package com.evampsaanga.controllers;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evampsaanga.models.GetUsersResponse;
import com.evampsaanga.models.User;
import com.evampsaanga.services.UserServices;
import com.evampsaanga.utils.CommonUtils;
import com.evampsaanga.utils.StatusCode;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author Muneeb Rehman
 *
 */
@Api(value = "User Controller", description = "Manages user related services.", produces = "application/json", tags = {
	"User Management" })
@RestController
@RequestMapping("/rest/users")
public class UserController {

    @Autowired
    UserServices userServices;

    /*----------------------------------------------- Get User Details ----------------------------------------------------*/

    @ApiOperation(value = "Get Users")
    @ApiResponses(value = { @ApiResponse(code = StatusCode.SUCCESS_CODE, message = "Success Code is 0") })
    @GetMapping("get")
    public GetUsersResponse getUsers(HttpServletRequest httpServletRequest) throws SQLException, Exception {

	CommonUtils.printInfoLog("Request Landed in GET USERS Controller");

	GetUsersResponse getUsersResponse = userServices.getUsers();

	CommonUtils.printInfoLog("[Response]" + CommonUtils.getJSONFromMapper(getUsersResponse));

	return getUsersResponse;
    }

    @ApiOperation(value = "Add User")
    @ApiResponses(value = { @ApiResponse(code = StatusCode.SUCCESS_CODE, message = "Success Code is 0") })
    @PostMapping("add")
    public User insert(@RequestBody @Valid User user, HttpServletRequest httpServletRequest)
	    throws SQLException, Exception {

	CommonUtils.printInfoLog("Request Landed in Add User Controller");

	User addUserResponse = userServices.addUsers(user);

	CommonUtils.printInfoLog("[Response]" + CommonUtils.getJSONFromMapper(addUserResponse));

	return addUserResponse;
    }

}
