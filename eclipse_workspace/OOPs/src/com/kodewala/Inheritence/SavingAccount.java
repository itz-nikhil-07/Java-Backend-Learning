package com.kodewala.Inheritence;

//Child class

public class SavingAccount extends Account {
	
	public void openSavingAccount(String name, String address, String type) {
		
		//calling parent class constructor 
		//reusing the existing functionalities
		
		openBankAccount(name, address, type);
	}
}