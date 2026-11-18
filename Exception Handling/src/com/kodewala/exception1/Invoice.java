package com.kodewala.exception1;

public class Invoice {
	public void generateInvoice() {
		try {
			connectDatabase();
			String name = null;
			name.lastIndexOf("a");
			System.out.println("Generating an Invoice");
			System.exit(0); //linux kind of same status job to show 
			//it is compulsory to close the connection once when we open it 
			closeDbConnection();
		}catch (Exception e) {
			System.out.println("It is risky code");
			e.printStackTrace();
		}
		finally  {
			System.out.println("this is finally block"); //this is finally block which works as compulsory 
			//execution whether try and catch works or not
		} 
	}

	private void closeDbConnection() {
		
	}

	private void connectDatabase() {
		System.out.println("this is database conncection method");
		
	}

}
