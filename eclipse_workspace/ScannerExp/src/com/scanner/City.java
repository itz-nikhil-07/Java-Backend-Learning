package com.scanner;

import java.util.Scanner;

public class City {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		sc.nextLine();

		System.out.print("Enter city: ");
		String city = sc.nextLine();

		System.out.println(age);
		System.out.println(city);
		
		sc.close();
	}
}