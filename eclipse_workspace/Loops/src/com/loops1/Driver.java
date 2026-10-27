package com.loops1;

public class Driver {
	public static void main (String []args) {
		BankDetails b1 = new BankDetails("Ram", 3000, 754882943);
		BankDetails b2 = new BankDetails("Mohan", 1500, 495993934);
		BankDetails b3 = new BankDetails("Shakti", 1800, 23454566);
		BankDetails b4 = new BankDetails("Sekher", 4000, 948595738);
		BankDetails b5 = new BankDetails("Amit", 1200, 847392847);
		
		//printed the objects without using if or for loop conditional 
		//it is being solved using ternary operators which is only operators in java taking 3 operands 
		
		System.out.println(b1.balance <= 2000 ? "Name: " + b1.name + " balance: " + b1.balance : "");
		System.out.println(b2.balance <= 2000 ? "Name: " + b2.name + " balance: " + b2.balance : "");
		System.out.println(b3.balance <= 2000 ? "Name: " + b3.name + " balance: " + b3.balance : "");
		System.out.println(b4.balance <= 2000 ? "Name: " + b4.name + " balance: " + b4.balance : "");
		System.out.println(b5.balance <= 2000 ? "Name: " + b5.name + " balance: " + b5.balance : "");
	}
}