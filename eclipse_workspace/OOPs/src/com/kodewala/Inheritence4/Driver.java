package com.kodewala.Inheritence4; 

//Disadvantage of Inheritance is 1.Tightly coupled 2.Heavy loading 3.if parent changes child has to adapt.

class Account {
	
	public void openAccount(String userId , String email) {
		System.out.println("Account.openAccount");
	}
}

class SavingAccount extends Account {
	
	@Override  //Overriding means modifying the existing method
	
	public void openAccount(String userId, String email) {
		System.out.println("SavingAccount.openAccount");
	}
}

class SrCitAccount extends SavingAccount {
	
	@Override
	public void openAccount (String userId, String email) {
		System.out.println("SrCitAccount.openAccount");
	}
}

class Pension extends SrCitAccount {
	
	@Override
	public void openAccount (String userId, String email) {
		System.out.println("SrCitAccount.openAccount");
	}
}


public class Driver {

	public static void main(String[] args) {
		
		Pension p1 = new Pension();
		p1.openAccount("Nik123", "nik01@gmail.com");
	}
}