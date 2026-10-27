package com.kodewala.String4;

public class Driver {

	public static void main(String[] args) {
		QueryGenerator q = new QueryGenerator();
		StringBuilder sb = q.generateQuery(null,0);
		System.out.println(sb);

	}

}