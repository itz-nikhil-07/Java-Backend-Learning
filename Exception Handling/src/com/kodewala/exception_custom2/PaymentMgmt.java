package com.kodewala.exception_custom2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PaymentMgmt {
	public void doPayment(String account , int amount) throws FundTransferException {
		try {
			checkBalance(account , amount);
		}
		catch (NullPointerException e) { //java 7 introduced multiple exceptions in catch blocks 
			throw new FundTransferException("You do not have enough balance OR " + "in case you have opend the account recently, "
					+ "please wait for 24rs before doing fund tranfer");
		}
	}
	
	private boolean checkBalance(String account , int amount ) {
		boolean checkBalanceStatus = false;
		int balance = 1000;
		if (amount > balance) {
			throw new InsufficientBalanceException(account + " does not have enough balance and current balance is " + balance);
		}
		else {
			// allow to transfer fund
			checkBalanceStatus = true;
		}
		return checkBalanceStatus;
	}
}