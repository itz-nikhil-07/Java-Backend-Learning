package com.kodewala.Inheritence3;

public class BankAccount {

	String accountHolder;
	double balance;

	BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void deposit(double amount, String reference) {
		balance += amount;
		System.out.println("reference: " + reference);
	}

	public double calculateInterest() {
		return 0;
	}
	
	public void displayDetails() {
		System.out.println("Name: " + accountHolder);
		System.out.println("Balance: " + balance);
	}
}


class SavingAccount extends BankAccount {

	SavingAccount(String accountHolder, double balance) {
		super(accountHolder, balance);
	}

	@Override
	public double calculateInterest() {
		return balance * 5 / 100;
	}
}

class CurrentAccount extends BankAccount {

	CurrentAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public double calculateInterest() {
		return 0;
	}
}