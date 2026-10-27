package com.loops3;

public class Driver {

	public static void main(String[] args) {
		Students s1 = new Students("Nikhil", 88);
		Students s2 = new Students("vineet", 43);
		Students s3 = new Students("lucky", 36);
		Students s4 = new Students("sarthak", 55);

		Students stu[] = new Students[4];

		stu[0] = s1;
		stu[1] = s2;
		stu[2] = s3;
		stu[3] = s4;
		int count = 0;

		for (int index = 0; index < stu.length; index++) {
			if (stu[index].marks > 50) {
				System.out.println(stu[index].name + "," + stu[index].marks);
				count++;
			}
		}
		System.out.println("passed students: " + count);
		System.out.println("total students: " + stu.length);
	}
}