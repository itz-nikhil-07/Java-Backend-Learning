package com.kodewala.Overriding;

class BankAccount {

	public String displayDetails(String name, int bal) {
		System.out.println("Demo.displayDetails()");
		return "show details";
	}
}

class SavingAccount extends BankAccount {

//	1.Method name should be same.
//	2.Type , Order, no. of args should be same.
//	3.Return type should be same except covarient.
//	4.Access modifier should be same or widen like increasing the scope of it not decreasing.

	@Override
	public String displayDetails(String name, int bal) {
		System.out.println("SavingAccount.displayDetails()" + name + "," + bal);
		return "display";
	}
}

public class Demo {
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		sa.displayDetails("Nikhil", 100);
	}

}