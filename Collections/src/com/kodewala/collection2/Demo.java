package com.kodewala.collection2;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		
		//the default size of Array is 10 but if we resize it then it will increase by 50% 
		ArrayList<String> list = new ArrayList<>(100); //declaring the size of array as 100 
		
		list.add("Banglore");
		list.add("Delhi");
		list.add("Chennai");
		list.add("Prayagraj");
		list.add("Mysore");
		list.add("kannur");
		list.add("Mumbai");
		list.add("Pune");
		list.add("Payyanur");
		list.add("Sikkim");
		list.add("Jaipur");
		
		list.add("Srinagar");
		
		System.out.println(list);
		System.out.println(list.size());
	}

}
