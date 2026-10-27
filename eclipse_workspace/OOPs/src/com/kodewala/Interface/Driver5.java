package com.kodewala.Interface;

interface Money {
	void pay(double amount);
}

class UPI implements Money {
	@Override 
	public void pay(double amount) {
		System.out.println("The amount paid using UPI ₹" + amount);
	}
}

class Card implements Money {
	@Override
	public void pay(double amount) {
		System.out.println("The amount paid using Card ₹" + amount);
	}
}

public class Driver5 {

	public static void main(String[] args) {
		Money p = new UPI();
		p.pay(1500);
		p = new Card();
		p.pay(2500);
	}
}