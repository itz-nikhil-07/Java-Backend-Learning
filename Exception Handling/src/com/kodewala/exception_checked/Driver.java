package com.kodewala.exception_checked;

/*
 * author Nikhil
 * in this example we solved the query for multiple nested try and catch blocks 
 */
public class Driver {
	public static void main(String[] args) {
		try {
			System.out.println("Outer try Started");

			try {
				String name = null;
				System.out.println(name.startsWith("r"));
			} catch (NullPointerException e) {
				System.out.println("this is Error");
				e.printStackTrace();
			}
			int values[] = { 10, 20, 30 };
			System.out.println(args[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("this is outer error");
			e.printStackTrace();
		}
		System.out.println("here program ends...");
	}
}