package com.loops3;

public class Security {

	public static void main(String[] args) {
		String attempts[] = {"Valid", "Valid", "Valid", "Unauthorized", "Valid"};
		
		for (int i = 0; i < attempts.length; i++) {
			if (attempts[i] == "Valid") {
				System.out.println(attempts[i]);
			}
			
		}
		
	}

}
