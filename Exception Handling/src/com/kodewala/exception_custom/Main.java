package com.kodewala.exception_custom;

public class Main {
	public static void main(String[] args) {
		AgeValidator av = new AgeValidator();
		try {
			av.validateAge(16);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
//			System.out.println("Exception handled successfully");
//			e.printStackTrace();
		}
		System.out.println("program ends...");
	}
}