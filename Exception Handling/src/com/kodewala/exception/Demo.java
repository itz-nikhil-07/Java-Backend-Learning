package com.kodewala.exception;

/*
 * author Nikhil
 */
public class Demo {
	public static void main(String[] args) {
		String name = args[0]; //command line arguments
		String address = args[1];
		
		System.out.println(name);
		System.out.println(address); 
		
		//program run until here then it throws Null Pointer exception
		
		String namee = null;
		System.out.println(namee.length());
	}

}
