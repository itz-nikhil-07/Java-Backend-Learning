package com.kodewala.exception;
/*
 * author Nikhil
 * Here we wrote our first exception handling code by ourselves
 */
public class Demo1 {
	public static void main(String[] args) {
		String result = null;
		int number = 0;
		System.out.println("Program start");

		try {
			System.out.println(result.length());
			System.out.println("Start");
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("this is an error");
			e.printStackTrace();
		} catch (NullPointerException e) {
			//System.out.println("this is also an error");
			e.printStackTrace();
		}
		System.out.println("Program ends here");
	}
}