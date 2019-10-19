package com.evampsaanga.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.PreparedStatement;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommonUtils {

    public static String getJSONFromMapper(Object object) throws JsonProcessingException {

	return new ObjectMapper().writeValueAsString(object);
    }

    public static void printInfoLog(String logMsg) {
	System.out.println(logMsg);

    }

    public static void printDebugLog(String logMsg) {
	System.out.println(logMsg);
    }

    public static void printErrorLog(String logMsg) {
	System.out.println(logMsg);

    }

    public static String printStackTrace(Exception exception) {
	StringWriter sw = new StringWriter();
	PrintWriter pw = new PrintWriter(sw);
	exception.printStackTrace(pw);
	return sw.toString();
    }

    public static String printDBQuery(PreparedStatement preparedStatement) {

	return preparedStatement.toString().split(":")[1];
    }

}
