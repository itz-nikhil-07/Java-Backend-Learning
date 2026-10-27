package com.kodewala.controlflow;

public class Driver2 {

	public static void main(String[] args) {
		Driver2 d2 = new Driver2();
		int day = Integer.parseInt(args[0]); 
		d2.show(day);
	}

	public void show(int number) {
		switch (number) {
		case 1:
			System.out.println("MONDAY");
			break;

		case 2:
			System.out.println("TUESDAY");
			break;

		case 3:
			System.out.println("WEDNESDAY");
			break;

		case 4:
			System.out.println("THURSDAY");
			break;

		case 5:
			System.out.println("FRIDAY");
			break;

		case 6:
			System.out.println("SATURDAY");
			break;

		case 7:
			System.out.println("SUNDAY");
			break;

		default:
			System.err.println("Invalid input , please choose any number");
			break;
		}
	}

}
