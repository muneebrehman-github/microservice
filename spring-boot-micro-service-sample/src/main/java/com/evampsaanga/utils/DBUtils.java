package com.evampsaanga.utils;

import java.sql.Connection;

public class DBUtils {

    // static connection object to hold reference to database
    protected static Connection connection;
    // initializing resource bundle to get database properties from
    // properties file
    // static ResourceBundle resourceBundle =
    // ResourceBundle.getBundle(Constants.RESOURCE_BUNDLE_CONFIGURATIONS);

    /**
     * Method returns singleton connection object for database
     * 
     * @return Connection object
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
	// checking if connection is object is null or closed or invalidated
	// then create new reference to database
	// if (connection == null || connection.isClosed() || !connection.isValid(0)) {
	// DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	//
	// CommonUtils.printDebugLog("Database connection is null or invalidated
	// initializing new connection");
	//
	// // CommonUtils.printDebugLog("Initializing Connection-URL:" +
	// // resourceBundle.getString("mysql.url") + ", USER:"
	// // + resourceBundle.getString("mysql.user") + ", PASSWORD:"
	// // + resourceBundle.getString("mysql.password"));
	// // initializing connection object
	// // connection =
	// // DriverManager.getConnection(resourceBundle.getString("mysql.url"),
	// // resourceBundle.getString("mysql.user"),
	// // resourceBundle.getString("mysql.password"));
	//
	// connection = DriverManager.getConnection(
	// "jdbc:mysql://localhost:3306/users?autoReconnect=true&useUnicode=true&characterEncoding=utf8&useSSL=false",
	// "root", "root");
	//
	// } else {
	// CommonUtils.printDebugLog("Database already Connected");
	// }
	//
	// // returning connection object
	return connection;
    }

    public static void main(String[] args) throws Exception {
	DBUtils.getConnection();
    }
}
