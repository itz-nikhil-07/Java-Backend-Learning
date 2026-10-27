package com.kodewala.Encapsulation1;

public class FundTransfer {
	String name;
	int accountno;
	private int balance;
	
	
	FundTransfer(String name, int accountno, int balance) {
		this.name = name;
		this.accountno = accountno;
		this.balance = balance;
	}
	
	//setter
	public void transfer(int amount) {
		if (amount >0 && amount <= balance) {
			balance -= amount;
		}
	}
	
	public int getBalance() {
		return balance;
	}
}