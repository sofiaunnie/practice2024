package practice2024;

import java.util.Scanner;

public class EditString {

	public static String Eniola(String name, char ch1, char ch2) {
		return name.replaceAll(String.valueOf(ch1), String.valueOf(ch2));

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// The string being accepted
		StringBuilder modifiedString = new StringBuilder();
		// modified string is the string after commands have been used
		StringBuilder originalString = new StringBuilder();

		System.out.print("Enter a string (or 'x' to exit): ");
		String input = scanner.nextLine();
		modifiedString.append(input);
		originalString.append(input);
		
		while (true) {
			System.out.println("\nCurrent String: " + modifiedString);
			System.out.print("Choose an operation (U, L, R, C ch1 ch2, Z, x): ");
			String operation = scanner.nextLine();

			if (operation.equalsIgnoreCase("x")) {
				System.out.println("Exiting the program. Final String: " + modifiedString);
				break;
			}

			switch (operation.toUpperCase()) {
			case "U":
				modifiedString = new StringBuilder(modifiedString.toString().toUpperCase());
				break;
			case "L":
				modifiedString = new StringBuilder(modifiedString.toString().toLowerCase());
				break;
			case "R":
				modifiedString.reverse();
				break;
			case "C":
				System.out.println("Enter Old Character: ");
				char ch1 = scanner.nextLine().charAt(0);
				System.out.println("Enter New Character: ");
				char ch2 = scanner.nextLine().charAt(0);

				originalString = new StringBuilder(modifiedString.toString());
				// Call the method to replace the character
				modifiedString = new StringBuilder(Eniola(modifiedString.toString(), ch1, ch2));
				System.out.println("Result after replacement: " + modifiedString);
				break;
			case "Z":
				modifiedString = new StringBuilder(originalString.toString());

			}

		}

	}
}
