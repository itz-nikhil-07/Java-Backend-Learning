package com.scanner;

import java.util.InputMismatchException;

//import java.util.Scanner;

public class Bankdetails {
	public static void main (String [] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		try {
			System.out.println("Enter account Holder name: ");
			String name = sc.nextLine();
			System.out.println("Enter account balance: ");
			Double balance = sc.nextDouble();
			
			System.out.println("Account created successfully!!");
			System.out.println("Account Holder name: " + name);
			System.out.println("Account Balance is: ₹" + balance);
		}
		catch (InputMismatchException e) {
			System.err.println("Invalid input");
			System.err.println("Please enter correct input");
		} 
		finally {
			sc.close();
		}
	}
}