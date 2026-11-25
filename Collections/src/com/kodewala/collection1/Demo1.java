package com.kodewala.collection1;
import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> prices = new ArrayList<>();
		prices.add(500);
		prices.add(null);
		prices.add(120);
		prices.add(null);
		
		//updating the element of second index 
		prices.set(2, 777);
		
		//removing the fourth element
		prices.remove(4);
		
		//accessing the element which contains the  specific value
		System.out.println(prices.contains(null));
		
		//checking the empty condition
		System.out.println(prices.isEmpty());
		
		//accessing the prices
		System.err.println(prices);
			
		}
	}