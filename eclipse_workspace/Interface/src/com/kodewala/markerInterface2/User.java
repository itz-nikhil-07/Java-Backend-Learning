package com.kodewala.markerInterface2;

public class User implements Cleanable {
	String name;
	String id;

	public User(String name, String id) {
		this.name = name;
		this.id = id;
	}
}