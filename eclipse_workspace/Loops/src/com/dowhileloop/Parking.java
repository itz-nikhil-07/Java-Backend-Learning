package com.dowhileloop;

public class Parking {

	public static void main(String[] args) {
		String choice = "No";

		do {
			System.out.println("Open the gate");
			System.out.println("Allow the vehicle to enter");
			System.out.println("Another vehicle is waiting?");
			System.out.println("Yes");
			System.out.println("Open the gate");
			System.out.println("Allow the vehicle to enter");
			System.out.println("Another vehicle is waiting?");
			System.out.println("No");
		} while (choice.equals("Yes"));
		System.out.println("Gate Closed");
	}
}