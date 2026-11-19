package com.kodewala.exception_custom1;

public class Account {
	void openAccount(String name, String address) {
		System.out.println("Account.openAccount()START...");
		activateAccount("23456");
		System.out.println("Account.openAccount()END...");

	}

	private void activateAccount(String accNo) {
		System.out.println("Account.activateAccount()START...");
		try {
			checkAccountStatus(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Account.activateAccount()END...");
	}

	private boolean checkAccountStatus(String accNo) throws Exception {
		try {
			accNo.startsWith("sbi");
		} catch (Exception e) {
			throw new Exception("accoutn no, is not starting with sbi ");
		}
		return false;
	}
}
