package com.lsgskychef.challenge;

public class QueryUsers {

	public static void main(String[] args) {
		
		//uvo will have list of user where last name starts with given string (arg[0]/first argument)
		User_VO uvo = User_VO.getUsersByLastName(args[0]);
	}

}
