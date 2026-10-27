package com.kodewala.Encapsulation1;

public class Driver {

	public static void main(String[] args) {
		FundTransfer f1 = new FundTransfer("Kodewala",0000,5000);
		f1.transfer(2000);
		int balance = f1.getBalance();
		System.out.println(balance);
	}
}