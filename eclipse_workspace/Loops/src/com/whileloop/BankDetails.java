package com.whileloop;

import java.util.Scanner;

public class BankDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = 5000;

		while (true) {
			System.out.println("====BANK MENU====");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check balance");
			System.out.println("4. Exit");

			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the Deposit amount");
				double deposit = sc.nextDouble();

				if (deposit > 0) {
					System.out.println("Deposit successful");
					balance += deposit;
					System.out.println("Balance: ₹" + balance);
				} else {
					System.err.println("Invalid deposit amount");
				}
				break;
			case 2:
				System.out.println("Enter the withdraw amount");
				double withdraw = sc.nextDouble();

				if (withdraw <= 0) {
					System.err.println("Invalid withdrawal amount");
				} else if (withdraw > balance) {
					System.err.println("Insufficient balance");
				} else {
					balance -= withdraw;
					System.out.println("Withdrawal Successful!");
					System.out.println("Balance: ₹" + balance);
				}
				break;
			case 3:
				System.out.println("Current balance: ₹" + balance);
				break;

			case 4:
				System.out.println("Thankyou for banking with us!!!");
				break;

			default:
				System.err.println("Inavlid choice");
			}
			if (choice == 4) {
				break;
			}
		}
		sc.close();
	}
}