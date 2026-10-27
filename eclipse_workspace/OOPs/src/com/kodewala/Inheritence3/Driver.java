package com.kodewala.Inheritence3;

public class Driver {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount("Nikhil", 100);
		sa.deposit(100);
		sa.deposit(200, "Kw123");

		CurrentAccount ca = new CurrentAccount("Daadu", 500);

		System.out.println("Saving Account");
		sa.displayDetails();
		System.out.println(sa.calculateInterest());
		
		System.out.println(" ");

		System.out.println("Current Account");
		ca.displayDetails();
		System.out.println(ca.calculateInterest());
	}
}