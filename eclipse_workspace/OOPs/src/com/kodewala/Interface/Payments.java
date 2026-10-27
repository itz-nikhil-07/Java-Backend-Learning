package com.kodewala.Interface;

interface Payment {
	void pay();
}

class UPIPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("UPIPayment.pay()");
	}
}

class CardPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("CardPayment.pay()");
	}
}

public class Payments {

	public static void main(String[] args) {
		Payment p = new UPIPayment();
		p.pay();
		p = new CardPayment(); //Runtime polymorphism is working here as same reference points for one object so compiler knows whom to call 
		p.pay();
	}
}