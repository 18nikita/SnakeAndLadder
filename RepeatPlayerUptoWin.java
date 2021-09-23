package com.bridgelabz.snakeladder;

public class RepeatPlayerUptoWin {

	public static void main(String[] args) {
		// Repeat player upto winning position
		// //Startposition
		int startposition = 0;
		System.out.println("Starting position of player is :" + "" + startposition);

		// Constants

		int NO_PLAY = 0;
		int IS_Ladder = 1;
		int IS_Snake = 2;

		// variables
		int position = 0;

		while (position < 100) {

			int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
			System.out.println("diceNumber is : " + diceNumber);

			int option = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("selected player option : " + option);

			switch (option) {
			case 1:
				position = diceNumber + position;
				if (position > 100) {
					position = 100;
				}
				System.out.println("position for the player after the ladder is : " + position);
				break;

			case 2:
				position = position - diceNumber;
				if (position < 0) {
					position = 0;
				}

				System.out.println("position for the player after the Snake is : " + position);
				break;

			default:
				System.out.println("No play");
			}
		}
	}
}
