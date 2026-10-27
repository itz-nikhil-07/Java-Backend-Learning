package com.kodewala3;

public class User {
	String userId;
	String userName;
	String type;
	static int livecount = 0;

	public User(String userId, String userName, String type) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.type = type;
	}

	public User(String userName, String type) {
		super();
		this.userName = userName;
		this.type = type;
	}

	public User() {

	}

	// IIB INSTANCE INIT BLOCK

	{
		livecount += 1;
	}

}
