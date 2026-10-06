package view;

import java.util.Scanner;

/**
 * Handles console user input and basic validation.
 */
public class InputView {

    /**
     * Reads a person's name from the console.
     *
     * @param scanner the Scanner object for reading input
     * @return the entered name string
     */
    public static String readName(final Scanner scanner) {

        final String name = scanner.nextLine();

        return name;
    }

    /**
     * Reads a person's age from the console after validating the input.
     *
     * @param scanner the Scanner object for reading input
     * @return the validated age integer
     */
    public static int readAge(final Scanner scanner) {
        validateIntInput(scanner);
        final int age = scanner.nextInt();
        scanner.nextLine();

        return age;
    }

    /**
     * Validates that user input is a valid integer.
     * Prompts the user to retry if the input is invalid or out of integer range.
     *
     * @param scanner the Scanner object to check input
     */
    public static void validateIntInput(final Scanner scanner) {
        while (!scanner.hasNextInt()) {

            if (scanner.hasNextBigInteger()) {
                System.out.println("\nNumber is too large for an integer! Try again: ");
            } else {
                System.out.println("\nInvalid input! Please enter a valid integer number: ");
            }

            scanner.nextLine();
        }
    }

}
