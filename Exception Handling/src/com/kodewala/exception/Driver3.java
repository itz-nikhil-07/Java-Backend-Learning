package com.kodewala.exception;

/*
 * author Nikhil
 */
class Atm {
	public void checkBalance() {
		String value = null;
		value.length();
	}

	public void withdraw() {
		checkBalance();
	}
}

public class Driver3 {
	public static void main(String[] args) {
		Atm a = new Atm();
		try {
			a.withdraw();
		} catch (NullPointerException e) {
			System.out.println("It is a main method exception");
		}
		System.out.println("Program completed");
	}
}