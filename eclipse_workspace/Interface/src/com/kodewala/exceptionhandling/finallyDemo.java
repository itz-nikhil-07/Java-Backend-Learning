package com.kodewala.exceptionhandling;

/*
 * author Nikhil
 */
public class finallyDemo {
	public static void main(String[] args) {

		try {
			int num = 10 / 0;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
		} finally {
			System.out.println("Finally block executed"); //finally block executes either way
		}
		System.out.println("Program completed");
	}
}