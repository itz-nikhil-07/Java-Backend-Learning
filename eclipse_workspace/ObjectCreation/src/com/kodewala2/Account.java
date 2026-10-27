package com.kodewala2;

class AccountMgmt {
	public AccountMgmt () {
		System.out.println("this is super class .....");
	}
}

public class Account {
	String accountnumber;
	
	Account (String accountnumber) {
		super(); //1st line
		//2nd line will always call IIB... will be called for each object....
		System.out.println("Account.Account(String accountnumber)");
		this.accountnumber = accountnumber;
	}
	  // calling IIB (instance init block
	{
		System.out.println("IIB (INSTANCE INIT BLOCK)");
	
	}
}
