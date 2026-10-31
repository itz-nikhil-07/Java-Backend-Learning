package com.kodewala.Interface4;

//marker interface 

public interface CloneEligible {
  //intentionally empty
}

class Student implements CloneEligible {
	
}


class Employee {
	
}

//object class to call clone eligible interface to check which class implements the interface or not 
class ObjectProcessor {
	public void process (Object obj) {
		if(obj instanceof CloneEligible) {
			System.out.println(obj.getClass().getSimpleName() + " is eligible for process");
		}
		else {
			System.out.println(obj.getClass().getSimpleName() + " is not eligible for process");
		}
 	}
}