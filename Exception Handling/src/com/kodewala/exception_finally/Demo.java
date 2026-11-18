package com.kodewala.exception_finally;

public class Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		int result = d.calcDiscount(100, 10);
		System.out.println(result);
	}

	private int calcDiscount (int amount , int disc) {
		int finalAmt =0;
		try {
			finalAmt = amount - (amount * disc/100);
			return finalAmt;
		}catch (Exception e) {
			System.out.println("Some exception occurred");
			e.printStackTrace();
		}
		finally {
			finalAmt = 110; //finally overrides the return type if it is written inside the finally block
			return finalAmt;  //output 110
			//if not returned from finally then the output will  be 90
		}
	}
}