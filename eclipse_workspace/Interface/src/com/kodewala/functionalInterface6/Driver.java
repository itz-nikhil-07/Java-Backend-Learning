package com.kodewala.functionalInterface6;

public class Driver {
	public static void main(String[] args) {
//		IAccount account = () ->  //this is lembda expression 
//		{
//			System.out.println("this is account opening...");
//		};
//		account.openAccount();
//	}

		IAccount account = (name, add, amt) -> { //this is how we provide arguments to the lembda 
			System.out.println("This account belongs to: " + name + "," + add + "," + "balance is: ₹" + amt);
			return "";
		};
		account.accountDetails("Nikhil", "Btm banglore", 115000);
	}
}