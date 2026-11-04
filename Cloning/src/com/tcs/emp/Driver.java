package com.tcs.emp;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address("16th main","27th cross","Bnglr");
		Employee e = new Employee("Nikhil","123",add);
		System.out.println(e.address.city);
		Employee e1 = (Employee) e.clone();
		System.out.println(e1.address.city);
		
	}
}
