package com.scanner;

import java.util.Scanner;

public class UserDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your first name: ");
		String fName = sc.next();
		
		//sc.next() actually making the input with /n ...which is why next program  is reading /n and  moving forward
		
		System.out.println("Please enter your full name: ");
		String name = sc.nextLine(); 
		
		//sc.nextLine() is reading the leftover /n and moving forward without printing full name.

		System.out.println("First Name is: " + name);
		System.out.println("Full Name is: " + fName);
		sc.close();
	}
}