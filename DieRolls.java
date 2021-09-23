package com.bridgelabz.snakeladder;

public class DieRolls {

	public static void main(String[] args) {
		// UC-2-The Player rolls the die to get a number between 1 to 6.
		
		double dieCheck= Math.floor(Math.random()*10) % 7;
		System.out.println("The no. on dice is : "+dieCheck);
	}
}
