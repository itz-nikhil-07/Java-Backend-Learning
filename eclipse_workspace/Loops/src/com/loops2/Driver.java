package com.loops2;

public class Driver {

	public static void main(String[] args) {
		Bankdetails b1 = new Bankdetails("Ram", 3000, 754882943);
		Bankdetails b2 = new Bankdetails("mohan", 1500, 495993934);
		Bankdetails b3 = new Bankdetails("shakti", 1800, 23454566);
		Bankdetails b4 = new Bankdetails("sekher", 4000, 948595738);
		
		//array indexing 
		Bankdetails bank[] = new Bankdetails[4]; 
		//assigning objects to the array indexes
		bank[0] = b1;
		bank[1] = b2;
		bank[2] = b3;
		bank[3] = b4;
		
		//making the for loop with condition 
		//since I had assigned the objects to array index, so I have to call them now by array name with indexes
		
		for (int index = 0; index < bank.length; index++) {
			if(  bank[index].balance<=2000) {
				System.out.println("Name : " + bank[index].name	+ " balance : " + bank[index].balance + "  mobileno : " + bank[index].mobileno);
			}
		}
		

	}

}