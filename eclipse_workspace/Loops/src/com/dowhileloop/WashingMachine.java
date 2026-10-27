package com.dowhileloop;

public class WashingMachine {

	public static void main(String[] args) {
		String choice;

		do {
			System.out.println("Washing machine started");
			System.out.println("Washing Clothes");
			System.out.println("Washing Completed");
			choice = "no";
		} while (choice.equals("yes"));
		System.out.println("Washing Stopped");
	}

}