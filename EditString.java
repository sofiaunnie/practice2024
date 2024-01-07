package practice2024;

import java.util.Scanner;

public class EditString {

	// Method to replace occurences of a caharacter in a string
	public static String Eniola(String name, char ch1, char ch2) {
		return name.replaceAll(String.valueOf(ch1), String.valueOf(ch2));

	}

	public static void main(String[] args) {

		// Scanner - accept user input string
		Scanner scanner = new Scanner(System.in);
		// The string being accepted
		StringBuilder modifiedString = new StringBuilder();
		// Original string before any commands are applied
		StringBuilder originalString = new StringBuilder();

		System.out.print("Enter a string (or 'x' to exit): ");
		String input = scanner.nextLine();

		// Initialize both modififedString and originalString 
		modifiedString.append(input);
		originalString.append(input);

		// Main loop for accepting commands
		while (true) {
			System.out.println("\nCurrent String: " + modifiedString);
			System.out.print("Choose an operation (U, L, R, C ch1 ch2, Z, x): ");
			String operation = scanner.nextLine();

			if (operation.equalsIgnoreCase("x")) {
				System.out.println("Exiting the program. Final String: " + modifiedString);
				break;
			}

		// Switch statement to handle different operations	
			switch (operation.toUpperCase()) {			
			case "U":
				// Convert the string to uppercase
				modifiedString = new StringBuilder(modifiedString.toString().toUpperCase());
				break;
			case "L":
				// Convert the string to lowercase
				modifiedString = new StringBuilder(modifiedString.toString().toLowerCase());
				break;	
			case "R":
				// Reverse the characters in the string
				modifiedString.reverse();
				break;
			case "C":
				// Replace occurences of a character in the string  C ch1 ch2
				System.out.println("Enter Old Character: ");
				char ch1 = scanner.nextLine().charAt(0);
				System.out.println("Enter New Character: ");
				char ch2 = scanner.nextLine().charAt(0);

				//Save the current state in originalString and apply the replacement
				originalString = new StringBuilder(modifiedString.toString());
				// Call the method to replace the character
				modifiedString = new StringBuilder(Eniola(modifiedString.toString(), ch1, ch2));
				System.out.println("Result after replacement: " + modifiedString);
				break;
			case "Z":
				// undo the most recent changes by reverting to the original string
				modifiedString = new StringBuilder(originalString.toString());
				break;

			}

		}

	}
}
