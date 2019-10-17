package co.grandcircus;

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		int userInt;
		int squared = 0;
		int cubed = 0;
		String numbers = "";
		String cont = "";

		Scanner scnr = new Scanner(System.in);

		do {
			System.out.println("Please enter a number from 1 to 10: ");
			userInt = scnr.nextInt();

			System.out.println("Number  " + "Squared  " + "Cubed   " + "\n" + "======  " + "======= " + "=====   ");
			
			for (int i = 1; i <= userInt && userInt <= 10; i++) {

				squared = i * i;
				cubed = i * i * i;

				numbers = i + "       " + squared + "       " + cubed;
				System.out.println(numbers);

			}

			System.out.print("Continue? (y/n): ");
			cont = scnr.next();
			System.out.println();

		} while (cont.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");

	}

}
