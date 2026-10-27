package com.kodewala.String1;

public class New {
	String name;

	New(String name) {
		this.name = name;
	}

	@Override //this helps in overriding toString so that object class behaves like String 
	public boolean equals(Object obj) {
		New n = (New) obj;
		return this.name.equals(n.name);
	}
	//above is the method of doing so 

	public static void main(String[] args) {
		New n1 = new New("Nikhil");
		New n2 = new New("Nikhil");
		System.out.println(n1.equals(n2));
	}
}

//Now the object is giving true for two 