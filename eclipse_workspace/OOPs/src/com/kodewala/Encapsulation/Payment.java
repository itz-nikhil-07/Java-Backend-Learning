package com.kodewala.Encapsulation;

public class Payment { // not received encapsulation yet because it says the critical details should be
						// hidden
	// int balance;
	private int balance;

	Payment(int balance) {
		super(); // by default
		this.balance = balance;
	}

	// Setter
	public void doCredit(int amount) {
		
		//modifying the data ........
		balance = balance + amount;
	}

	public void doDebit(int amount) {
		// fixing debit not in negative value
		if (amount > 0) {
			balance = balance - amount;
		}
	}

	// creating getter method to achieve encapsulation

	public int getBalance() {
		return balance;
	}
}