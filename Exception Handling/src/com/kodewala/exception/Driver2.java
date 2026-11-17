package com.kodewala.exception;

class Bank{
	public void doWithdraw (int amount, int balance) throws ArithmeticException {
		if(amount > balance) {
			throw new ArithmeticException("Insufficient balance");
		}
		System.out.println("Withdraw Successful");
	}
}


public class Driver2 {
	public static void main(String[] args) {
		Bank b = new Bank();
		try {
			b.doWithdraw(5000, 3000);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}