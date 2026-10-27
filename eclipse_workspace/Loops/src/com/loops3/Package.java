package com.loops3;

public class Package {

	public static void main(String[] args) {
		String status[] = { "Delivered", "Pending", "Delivered", "Cancelled", "Delivered", "Pending" };
		int count = 0;

		for (int i = 0; i < status.length; i++) {  //inserted the breakpoint and debugged the program using f5.
			if (status[i] == "Delivered") {
				//System.out.println("This package is being delivered");
				count++;
			}
			else {
				continue;
			}

		}
		System.out.println(count + " packages has been delievered.");
	}

}
