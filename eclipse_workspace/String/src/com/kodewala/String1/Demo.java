package com.kodewala.String1;

public class Demo {
 String name;

 public Demo(String name) {
	super();
	this.name = name;
 }
 
 public static void main(String[] args) {
	 
	 // We are interested in content that's why creating using literal
	 
	String city1 = "Banglore";
	String city2 = "Banglore";
	
	System.out.println(city1.equals(city2)); // .equals() did compared content for String
	
	//when we are interested in object's identity then we create new object 
	
	Demo d1 = new Demo("Kodewala");
	Demo d2 = new Demo("Kodewala");
	System.out.println(d1.equals(d2)); //.equals() did compared reference by default
}
}

//in SCP garbage collector will not have control 
//by default equals() method compares refernce and in string it compares content 