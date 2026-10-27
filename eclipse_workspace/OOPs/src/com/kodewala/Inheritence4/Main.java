package com.kodewala.Inheritence4;

//using interface

interface Camera {
	void takePhoto(); 

	default void showStatus() {
		System.out.println("Camera is ready");
	}
}

interface MusicPlayer {
	void playMusic();

	default void showStatus() {
		System.out.println("Music player is ready");
	}
}

class Smartphone implements Camera, MusicPlayer {

	@Override
	public void takePhoto() {
		System.out.println("Photo captured");
	}

	public void takenPhoto(String quality) {
		System.out.println("Camera quality is: " + quality);
	}

	@Override
	public void playMusic() {
		System.out.println("Music is playing");
	}

	@Override
	public void showStatus() {
		Camera.super.showStatus();
		MusicPlayer.super.showStatus();
		System.out.println("Smartphone is ready");
	}
}

public class Main {

	public static void main(String[] args) {
		Smartphone s1 = new Smartphone();
		s1.takePhoto();
		s1.takenPhoto("High");
		s1.playMusic();
		s1.showStatus();

		System.out.println(" ");
		System.out.println("Using interface reference");

		Camera c1 = s1;
		c1.takePhoto(); //calling overridden method
		c1.showStatus(); //calling overridden method

		System.out.println(" ");
		
		MusicPlayer m1 = s1;
		m1.showStatus(); //calling overridden method
		m1.playMusic(); //calling overridden method
	}
}