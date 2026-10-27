package com.dowhileloop;

public class Game {
	public static void main(String[] args) {
		int chance;

		do {
			System.out.println("Game Finished");

			System.out.println("Do you want to play again");
			System.out.println("1. Yes");
			System.out.println("2. No");
			chance = 1;
		} while (chance == 2); {
		System.out.println("Game Over");
		}
	}
}