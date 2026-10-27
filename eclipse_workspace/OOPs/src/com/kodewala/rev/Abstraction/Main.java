package com.kodewala.rev.Abstraction;


/**
 * Achieving abstraction by making the methods private and accessing them by a public method only 
 * so that it can't be accessed directly or modified.
 */
class BankMethod {

	public void banking(int amount) {
		credit();
		debit();
		UPI();
	}

	private void credit() {
		System.out.println("BankMethod.credit()");
	}

	private void debit() {
		System.out.println("BankMethod.debit()");
	}

	private void UPI() {
		System.out.println("BankMethod.UPI()");
	}

}

public class Main {

	public static void main(String[] args) {
		BankMethod bk = new BankMethod();
		bk.banking(100);
	}
}