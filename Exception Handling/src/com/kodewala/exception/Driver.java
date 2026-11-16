package com.kodewala.exception;

/*
 * this is how we manage the error thrown by program just catch it and program will execute smoothly without unexcepted error
 */
public class Driver {
	public static void main(String[] args) {
		System.out.println("Start");
		String name = null;
		int amount = 100;
		
		try {
			amount = amount /0;
			System.out.println(name.length());
			System.out.println("After length()");
		}
		catch (NullPointerException e) {
			System.out.println("name is null....");
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("amount cannot be divided by zero");
			e.printStackTrace();
		}
		System.out.println("End of program");
	}

}
