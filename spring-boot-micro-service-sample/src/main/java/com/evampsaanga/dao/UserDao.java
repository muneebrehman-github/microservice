package com.evampsaanga.dao;

import org.springframework.stereotype.Component;

import com.evampsaanga.models.GetUsersResponseData;

@Component
public class UserDao {

    public GetUsersResponseData getUsersData() throws Exception {
	GetUsersResponseData data = new GetUsersResponseData();

	// PreparedStatement preparedStatement = null;
	// String query = "select * from user";
	// preparedStatement = DBUtils.getConnection().prepareStatement(query);
	//
	// CommonUtils.printDebugLog("Get Users Query:" +
	// CommonUtils.printDBQuery(preparedStatement));
	// ResultSet rs = preparedStatement.executeQuery();
	// while (rs.next()) {
	// User user = new User();
	//
	// user.setFirstName(rs.getString("first_name"));
	// user.setLastName(rs.getString("last_name"));
	// data.getUser().add(user);
	// }
	return data;
    }

}
