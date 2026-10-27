package com.loops3;

public class Account {

	public static void main(String[] args) {
		int trans[] = { -500, 2000, -1000, -200, 5000, -700, 300 };
		int countwith = 0;
		int countdeposit = 0;
		int sumwith = 0;
		int sumdeposit = 0;

		for (int i = 0; i < trans.length; i++) {
			if (trans[i] < 0) {
				countwith++;
				sumwith += -trans[i];
			} else {
				countdeposit++;
				sumdeposit += trans[i];
			}
		}
		System.out.println("Total withdrawal transaction are: " + countwith);
		System.out.println("Total withdrawal amount is: " + sumwith);
		System.out.println("Total deposit transaction are: " + countdeposit);
		System.out.println("Total deposit amount is: " + sumdeposit);

	}

}
