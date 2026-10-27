package com.scanner;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String name = sc.nextLine();

		System.out.println("Please enter your age: ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.println(name);
		System.out.println(age);
		sc.close();
	}
}