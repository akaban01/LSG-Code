package com.lsgskychef.challenge;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class User_VO {
	
	private  ArrayList<User> users;

	public static User_VO getUsersByLastName(String searchString) {
		User_VO uvo = null;
		try {
			Connection con = DatabaseConnector.connect();
			PreparedStatement stm = con.prepareStatement("select id, user_name, first_name, last_name, status,"
					+ "created_by, created_date, updated_by, updated_date "
					+ "from USERS where last_name like ? " 
					+ "order by last_name, first_name, user_name");  // this one is for sorted result back from database
			stm.setString(1, searchString + "%");
			ResultSet resultSet = stm.executeQuery();
			ArrayList<User> usrs = new ArrayList<User>();
			while(resultSet.next()) {
				User user = new User(resultSet.getInt("id"),
						             resultSet.getString("user_name"),
						             resultSet.getString("first_name"),
						             resultSet.getString("last_name"),
						             resultSet.getString("status"),
						             resultSet.getString("created_by"),
						             resultSet.getTimestamp("created_date"),
						             resultSet.getString("updated_by"),
						             resultSet.getTimestamp("updated_date"));

				usrs.add(user);
			}
		} catch (SQLException e) {
			System.out.println("Could not connect to Database so returning null value");
			return null;
		}
		return uvo;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

}
