package com.kodewala.exception_custom;

public class AgeValidator {
	public void validateAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("user is not valid for voting...");
		}
		System.out.println("registration successful");
	}
}