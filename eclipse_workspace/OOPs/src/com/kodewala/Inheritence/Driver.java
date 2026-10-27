package com.kodewala.Inheritence;

public class Driver {
	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		sa.openSavingAccount("Nik","BTM Banglore","Saving account");	
	}
}

//static method can be extended but will be called method hiding 