package com.loops2;

public class Bankdetails {
	String name;
	int balance;
	int mobileno;

	public Bankdetails(String name, int balance, int mobileno) {
		this.name = name;
		this.balance = balance;
		this.mobileno = mobileno;
	}
}	

//we can make a method to check the condition of customer having balance less than 2000
//by making a method and nesting a if condition in it to check it.