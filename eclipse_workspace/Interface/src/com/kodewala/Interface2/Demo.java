package com.kodewala.Interface2;

interface IUser {
	default void getRole() {
		System.out.println("IUser.getRole()....");
	}
}

class User implements IUser {

	public void getRole() {
		System.out.println("User.getRole()....");
	}
}

public class Demo {

	public static void main(String[] args) {
		IUser u = new User();
		u.getRole();
	}
}