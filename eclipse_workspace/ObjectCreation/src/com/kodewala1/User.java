package com.kodewala1;

public class User {
	String username;
	String userId;
	String mobilenumber;
	
	static  //static block called once for all objects 
	{
		System.out.println("i am in static init block"); 
	}
	
	User (String username, String userId, String mobilenumber) {
		super(); //by default calling no args constructor
		System.out.println("User.User(String username, String userId, String mobilenumber)... Constructor");
		this.username = username;
		this.userId = userId;
		this.mobilenumber = mobilenumber;
	}
}