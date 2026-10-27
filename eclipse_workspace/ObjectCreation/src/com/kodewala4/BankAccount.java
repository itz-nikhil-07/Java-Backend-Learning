package com.kodewala4;

public class BankAccount {
	static int minimumBalance = 500;
	static int transactionLimit;
	
	static 
	{
		transactionLimit = 10000;
		System.out.println(transactionLimit);
	}

	static 
	{
		transactionLimit = 20000;
		System.out.println(transactionLimit);
	}
	
	public static void main(String[] args) {
		System.out.println(minimumBalance);
		System.out.println(transactionLimit);		
	}
}