package com.whileloop1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee[] e1 = new Employee[5];
		int i = 0;

		while (i < e1.length) {
			System.out.println("Employees " + (i + 1));

			System.out.println("Enter the employee name");
			String name = sc.nextLine();

			System.out.println("Enter the salary");
			double salary = sc.nextDouble();
			sc.nextLine();

			System.out.println("Enter the department");
			String dep = sc.nextLine();

			e1[i] = new Employee(name, salary, dep);
			i++;
		}
		System.out.println("\n===== EMPLOYEES =====");

		for (Employee employee : e1) {
			employee.display();
		}

		Employee highest = e1[0];

		for (Employee employee : e1) {

			if (employee.salary > highest.salary) {
				highest = employee;
			}
		}

		System.out.println("\n===== HIGHEST SALARY =====");

		highest.display();

		sc.close();
	}

}