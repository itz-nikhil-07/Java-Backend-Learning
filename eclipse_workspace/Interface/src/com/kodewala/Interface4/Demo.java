package com.kodewala.Interface4;
 
//JVM resolves the ambuigity of default method of interface in update java 8 by overriding the method and calling the overridden call at object creation
interface IUser {

	default void getRole() {
		System.out.println("this is default method of interface");
	}
}

class Admin implements IUser {

	public void getRole() {
		System.out.println("this is default method class");
	}
}

public class Demo {

	public static void main(String[] args) {
		IUser  u =  new Admin();
		u.getRole();
	}
}