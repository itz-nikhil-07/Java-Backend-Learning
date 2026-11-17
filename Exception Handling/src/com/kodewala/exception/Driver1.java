package com.kodewala.exception;
/*
 * author Nikhil
 */
public class Driver1 {
	public static void main(String[] args) {
		Account account = new Account();
		String accNo = null;//if we make it null or something else then program will terminate after doValidate method
		String address = "Btm banglore";
		account.doActivate(accNo,address);
	}

}

class Account {
	void  doActivate(String accNo,String address) {
		System.out.println("Account.doSomething()START...");
		doValidate(accNo,address); //Here our program will move to next method 
		System.out.println("Account.doActivate()END...");
	}
	
	boolean doValidate(String accNo, String address) {
		System.out.println("Account.doValidate()START..."); //after this program will terminate 
		try {
			
		boolean isValid = accNo.startsWith("SBI");
		
		}
//		catch (NullPointerException e) {
//			System.out.println("can not be null");
//			e.printStackTrace();
//		}
//		catch (Exception e) {
//			System.out.println("parent of all exception classes but still sub class of throwable class");
//			e.printStackTrace();
//		}
		catch (ArithmeticException e) {
			System.out.println("not divided by zero");
			e.printStackTrace();
		}
		System.out.println("program ends here");
		return true;
	}
}