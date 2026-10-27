package com.kodewala.Overloading;

public class Login {

	public void doLogin(String mobile, int otp) { //Version 1 of Overloading
		System.out.println("Login.doLogin(String mobile, int otp)");
	}

	public String doLogin(String email, String password) { //Version 2 of Overloading
		System.out.println("Login.doLogin(String email, String password)");
		return "do login";
	}

	public void doLogin(String gmail) {  //Version 3 of Overloading
		System.out.println("Login.doLogin(String gmail)");
	}
}

//Return type and access modifier has no role in Overloading methods .