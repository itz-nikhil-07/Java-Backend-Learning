package com.kodewala.functionalInterface6;

@FunctionalInterface
public interface IAccount {

	// void openAccount();

//Functional interface contains only one abstract method
// SAM(Single abstract method) and can be multiple other methods.

//functional interface can not be extended because it inherits the methods of extended interface 
//lembda expression used to implement the method without method name.
//lembda expression could be achieved only by functional interface 

	String accountDetails(String name, String address, double amount);
}