package com.kodewala.Abstraction;

abstract class Payment {
	double amount;
	
	Payment (double amount) {
		this.amount = amount;
	}
	
	abstract void processPayment();
	
	void showAmount() {
		System.out.println("The payment amount is: ₹" + amount);
	}
}

class UpiPayment extends Payment {
	
	UpiPayment(double amount){
		super(amount);
	}
	
	@Override
	public void processPayment() {
		System.out.println("Processing Upi Payment");
	}
}

class CardPayment extends Payment {
	
	CardPayment(double amount){
		super(amount);
	}
	
	@Override
	public void processPayment() {
		System.out.println("Processing Card Payment");
	}
}


public class Driver {

	public static void main(String[] args) {
		Payment p1 = new UpiPayment(100);
		p1.showAmount();
		p1.processPayment();
		
		CardPayment c1 = new CardPayment(200);
		c1.showAmount();
		c1.processPayment();
	}
}