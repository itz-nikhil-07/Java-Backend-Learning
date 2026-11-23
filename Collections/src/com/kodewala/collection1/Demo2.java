package com.kodewala.collection1;
import java.util.ArrayList;

public class Demo2 {
	public static void main(String[] args) {
		
		ArrayList<String> electronics = new ArrayList<>();
		//adding all five items to the list 
		electronics.add("Mobile");
		electronics.add("Laptop");
		electronics.add("Headphone");
		electronics.add("Mobile");
		electronics.add("Keyboard");
		
		//displaying all items 
//		for(int index =0; index<=electronics.size(); index++) {
//			System.out.println(electronics.get(index));
//		}
		
		System.out.println("this is shooping list");
		System.out.println("--------------");
		
		//this is enhanced way of writing the for loop and it just temporary stores the items as new name and then runs it 
		for(String item: electronics) {
			System.out.println(item);
		}
		
		//finding first indexOf mobile
		System.out.println(electronics.indexOf("Mobile"));
		
		//accessing the lastIndexOf mobile
		System.out.println(electronics.lastIndexOf("Mobile"));
		
		//checking the element exists in list 
		System.out.println(electronics.contains("Laptop"));
		
		//remove headphones by its value 
		electronics.remove(2);
		
		//printing updated list 
		System.out.println(electronics);
	}

}
