package com.kodewala.Interface;

interface BankRules {
	int MIN_BALANCE = 1000;
	
	static void displayRules() {
		System.out.println("Minimum balance rule applies");
	}
}

class SavingsAccount implements BankRules {
	
}


public class Driver6 {

	public static void main(String[] args) {
		System.out.println(BankRules.MIN_BALANCE); 
		BankRules.displayRules();
	}
}