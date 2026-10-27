package com.scanner1;

public class Driver {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// another way of creating scanner class without importing it above

		System.out.println("Enter product Id");
		sc.nextLine();

		System.out.println("Enter product name");
		sc.nextLine();

		System.out.println("Enter the price");
		sc.nextInt();

		sc.nextLine();

		Product p1 = new Product("101", "TV", 12000);
		p1.display();

		sc.close();
	}
}