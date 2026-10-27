package com.kodewala.Encapsulation;

public class Driver {

	public static void main(String[] args) {
		Payment payment = new Payment(500);
		payment.doCredit(200);
		payment.doDebit(-300); //negative vlaue dosent work as we fixed it 
		payment.doDebit(300);
		System.out.println(payment.getBalance());  //achieve encapsulation through getter and setter 	
	}
}


//Encapsulation means hiding the critical information...