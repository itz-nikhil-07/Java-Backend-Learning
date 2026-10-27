package com.scanner;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your age ");

		if (sc.hasNextInt()) {
			int age = sc.nextInt();
			System.out.println("Yoru age is:  " + age);
		} else {
			System.err.println("Please enter the price in right format");
		}
		sc.close();
	}
}