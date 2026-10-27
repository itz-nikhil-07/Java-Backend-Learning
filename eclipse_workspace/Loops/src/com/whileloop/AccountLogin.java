package com.whileloop;

import java.util.Scanner;

public class AccountLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int correctPin = 1234;
		int attempts = 0;
		boolean loggedIn = false;

		while (attempts < 3) {

			System.out.println("Please enter your PIN");
			long PIN = sc.nextLong();
			attempts++;

			if (PIN == correctPin) {
				System.out.println("Login Successful !!!");
				System.out.println("Welcome to your account.");
				loggedIn = true;
				break;
			} else {
				System.out.println("Incorrect PIN");
				System.out.println("Attempts remaining: " + (3 - attempts));
			}
		}
		if (!loggedIn) {
			System.out.println("Account Locked");
			System.out.println("Please contact the Bank");
		}
		sc.close();
	}
}