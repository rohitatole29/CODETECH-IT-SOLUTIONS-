package com.codetech.test;

import java.util.Scanner;

public class GusessingGame {

	public static void gusessingNumber() {
		Scanner scanner = new Scanner(System.in);
		int number = 1 + (int) (100 * Math.random());
		int k = 5;
		int i;
		System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");
		for (i = 0; i < k; i++) {
			int guess = scanner.nextInt();
			System.out.println("Guess the number:");

			if (number == guess) {
				System.out.println("Congratulations!" + " You guessed the number.");
				break;
			} else if (number > guess && i != k - 1) {
				System.out.println("The number is " + "too high " + guess);

			} else if (number < guess && i != k - 1) {
				System.out.println("The number is " + "too low " + guess);
			}
		}

		if (i == k) {
			System.out.println("You have exhausted" + " K trials.");

			System.out.println("The number was " + number);
		}
	}
	
	public static void main(String[] args) {
		gusessingNumber();
	}
}
