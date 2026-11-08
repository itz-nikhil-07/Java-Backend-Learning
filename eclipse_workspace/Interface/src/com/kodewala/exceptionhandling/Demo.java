package com.kodewala.exceptionhandling;
/*
 * author Nikhil
 * We are doing exception handling and in this we try to resolve error without crashing program , like here we did try catch 
 * statement to resolve error.
 */
public class Demo {
	public static void main(String[] args) {
		int balance = 5000;
		int customers = 0;

		try {
			int result = balance / customers;
			System.out.println("Result: " + result);
		}

		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		System.out.println("Program continues");
	}
}