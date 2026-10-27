package com.dowhileloop;

public class RestaurantOrder {
	public static void main(String[] args) {
		int choice;

		do {
			System.out.println("Order placed Successfully");

			System.out.println("Do you want to place another order");
			System.out.println("1. Yes");
			System.out.println("2. No");
			choice = 2; // assume users choice
		} while (choice == 1);
			System.out.println("Thankyou for Ordering");
	}
}