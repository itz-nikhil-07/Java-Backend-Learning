package com.kodewala.exceptionhandling;

public class Demo1 {

	public void withdraw(int balance, int amount) throws Exception {

		if (amount > balance) {
			throw new Exception("Insufficient balance!");
		}

		System.out.println("Withdrawal successful.");
	}
}