package com.lsgskychef.challenge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	public static Connection connect() throws SQLException {
		return DriverManager.getConnection("dummyURL", "dummyUser", "dummyPassword");
	}

}
