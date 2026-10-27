package com.kodewala.Overloading;

public class Driver {

	public static void main(String[] args) {
		Login login = new Login();
		login.doLogin("xyz@gmail.com");
		login.doLogin("9301841080", 1717);
		login.doLogin("xyz@gmail.com", "CORRECT");
	}
}