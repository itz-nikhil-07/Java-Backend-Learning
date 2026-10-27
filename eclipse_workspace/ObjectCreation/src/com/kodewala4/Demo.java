package com.kodewala4;

public class Demo {

	static String status = "offline";

	static {
		status = "Online";
		System.out.println("The status is: " + status);
	}

	static String message = "Ready";

	static {
		status = message;
		System.out.println(status);
	}

	public static void main(String[] args) {
		System.out.println(status);
		System.out.println(message);
	}
}