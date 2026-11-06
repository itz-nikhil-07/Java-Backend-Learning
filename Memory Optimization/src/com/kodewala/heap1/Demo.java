package com.kodewala.heap1;

/*
 * author - Nikhil
 */
public class Demo {

	Address address;
	Employee emp1;
	Employee clonedEmp;

	public void doSomething() throws CloneNotSupportedException {
		address = new Address("16th main", "27th cross", "Banglire");
		emp1 = new Employee("Kodewala", "kw123", address);
		clonedEmp = (Employee) emp1.clone();

		emp1.address.city = "Hyd";

		System.out.println(emp1.address.city);
		System.out.println(clonedEmp.address.city);

		emp1 = null; // nullifying the objects so that garbage collector remove them
		address = null;
		/*
		 * this is example for memory optimization Heap memory is creating other space
		 * for the variables and not removing them after the use
		 * 
		 */
	}
}
/*
 * Thread Dump = if out of memory error, pleas capture the thread dump increase
 * the heap size if possible - Workaround Restart the application - Workaround
 * explore the types of garbage collector
 */