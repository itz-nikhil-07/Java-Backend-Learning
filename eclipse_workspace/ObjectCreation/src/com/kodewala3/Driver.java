package com.kodewala3;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main()START");
		
		for (int i =0; i <= 100000; i++) {
			User user = new User();	
		}
		System.out.println("Total user are: " + User.livecount);

	}

}
