package com.dowhileloop;

public class DocumentPrint {

	public static void main(String[] args) {
		String choice;

		do {
			System.out.println("Printing Document");
			System.out.println("Document printed Successfully");
			System.out.println("Print another Document");
			System.out.println("Yes");
			System.out.println("Printing Document");
			System.out.println("Document printed Successfully");
			System.out.println("Print another Document");
			System.out.println("No");
			choice = "No";
		} while (choice.equals("Yes"));
		System.out.println("Printing stopped");
	}

}
