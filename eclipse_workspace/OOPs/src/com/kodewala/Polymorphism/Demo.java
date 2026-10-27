package com.kodewala.Polymorphism;

class User {

}

class AdminUser extends User {

}

public class Demo {

	public static void main(String[] args) {

		// parent class can refer child class object
		User u = new AdminUser(); // this is up casting

		// child class is referring parent class object
		AdminUser au = (AdminUser) new User(); // this is down casting
	}
}