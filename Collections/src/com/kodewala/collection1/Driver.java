package com.kodewala.collection1;
/*
 * author Nikhil
 * this is collection framework
 */
public class Driver {
	public static void main(String[] args) {
		
		//1.Store the price --> container box which holds the interger value
		
		int price[] = { 100, 2000, 5000, 300, 8764, 900 }; //memory - heap - store the database

		//2. process - find the price value above 1000
		for (int index = 0; index < price.length; index++) {
			int currentPrice = price[index];

			if (currentPrice > 1000) {
				System.out.println(price[index]);
			}
		}
	}

}