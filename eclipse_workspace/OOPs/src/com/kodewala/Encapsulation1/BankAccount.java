package com.kodewala.Encapsulation1;

public class BankAccount {
	private int balance;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
//	public void setDeposit(int amount) {
//		amount += balance;
//	}
	
	public int getBalance() {
		return balance;
	}
	
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public static void main(String[] args) {
		BankAccount bk = new BankAccount();
		bk.setBalance(5000);
		//bk.setDeposit(2000);
		bk.deposit(2000);
		int result = bk.getBalance();
		System.out.println(result);
	}
}