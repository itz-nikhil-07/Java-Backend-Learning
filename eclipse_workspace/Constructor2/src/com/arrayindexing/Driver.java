package com.arrayindexing;

public class Driver {
	
	
	public static void main(String[] args) {
		
		User u1 = new User("tv", "12000");
		User u2 = new User("washing machine", "20000");
		User u3 = new User("phone", "10000");
		User u4 = new User("bike", "50000");
		User u5 = new User("laptop", "60000");

		User users[] = new User[5];// arrays [5]	
		//assigning value
		
		users[0] = u1;
		users[1] = u2;
		users[2] = u3;
		users[3] = u4;
		users[4] = u5;
		
		System.out.println(u1);

	}

}