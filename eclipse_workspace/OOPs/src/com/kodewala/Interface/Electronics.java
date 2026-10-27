package com.kodewala.Interface;

interface Camera {
	void takePhoto();
}

interface MusicPlayer {
	void playMusic();
}

class SmartPhone implements Camera,MusicPlayer {  // One class can implement multiple interface 
	
	@Override
	public void takePhoto() {
		System.out.println("SmartPhone.takePhoto()");
	}
	
	@Override
	public void playMusic() {
		System.out.println("SmartPhone.playMusic()");
	}
}


public class Electronics {

	public static void main(String[] args) {
		SmartPhone s1 = new SmartPhone();
		s1.playMusic();
		s1.takePhoto();
	}
}