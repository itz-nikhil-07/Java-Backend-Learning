package com.kodewala.Interface4;

public class Driver {

	public static void main(String[] args) {
		ObjectProcessor processor = new ObjectProcessor();
		Student s = new Student();
		Employee e = new Employee();

		processor.process(e);
		processor.process(s);
	}
}