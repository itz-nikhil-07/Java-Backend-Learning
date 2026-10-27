package com.loops3;

public class Parking {

	public static void main(String[] args) {
		int parking[][] = { { 1, 0, 1, 1 }, { 0, 1, 0, 1 }, { 1, 1, 1, 0 } };
		int countocc = 0;
		int countemp = 0;

		for (int i = 0; i < parking.length; i++) {
			for (int j = 0; j <= parking.length; j++) {
				System.out.print(parking[i][j]);
				if (parking[i][j] == 0) {
					countemp++;
				}
				else {
					countocc++;
				}
			}
		}
		System.out.println("");
		System.out.println("The total count for empty slots are: " + countemp);
		System.out.println("The total count for occupied slots are: " + countocc);
		
	}
}