package com.lsgskychef.challenge;

import java.sql.Timestamp;

public class User {
	private int id;
	private String user_name;
	private String first_name;
	private String last_name; 
	private String status;
	private String created_by; 
	private Timestamp created_date;
	private String updated_by;
	private Timestamp updated_date;
	
	public User(int id, String user_name, String first_name, String last_name, String status, String created_by, Timestamp created_date, String updated_by, Timestamp updated_date) {
		setId(id);
		setUser_name(user_name);
		setFirst_name(first_name);
		setLast_name(last_name);
		setStatus(status);
		setCreated_by(created_by);
		setCreated_date(created_date);
		setUpdated_by(updated_by);
		setUpdated_date(updated_date);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public Timestamp getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}
}
