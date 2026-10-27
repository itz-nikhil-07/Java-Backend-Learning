package com.scanner2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer Name: ");
		String name = sc.nextLine();

		System.out.println("Enter product name: ");
		String product = sc.nextLine();

		System.out.println("Enter product price: ");
		int price = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter the quantity: ");
		int quantity = sc.nextInt();

		sc.nextLine();

		System.out.println("Do you want delivery? ");
		boolean del = sc.nextBoolean();

		// creating the product object
		//Shooping s1 = new Shooping("Nikhil", "Football", 300, 2, true);

		int subtotal = price * quantity;
		int delcharge = 0;

		if (del) {
			delcharge = 100;
		}

		int bill = subtotal + delcharge;

		System.out.println("======MY BILL======");
		System.out.println("Customer: " + name);
		System.out.println("Product: " + product);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Delivery: " + delcharge);
		System.out.println("Total: " + bill);
		sc.close();
	}
}