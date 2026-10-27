package com.whileloop;

public class Driver {

	public static void main(String[] args) {
		int max = 10;
		int number  = 1;
		
		while (number <= max) {
			System.out.println(number);
			number+=1;
		}

	}

}

//we use while when we don't know the count of iteration lasts
//when you need to repeat a block of code an unknown number of times based on a condition that changes during execution.