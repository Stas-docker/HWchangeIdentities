package controller;

import model.OptionToContinue;
import model.Person;
import view.Menu;

import java.util.Scanner;

/**
 * Controls the game flow, executing the primary application loop and step-by-step user choices.
 */
public class Steps {

    /**
     * Starts and manages the main game loop until the user chooses to exit.
     */
    public static void startGame() {
        try (final Scanner scanner = new Scanner(System.in)) {

            OptionToContinue choice = OptionToContinue.UNKNOWN;
            Menu.printBeginning();

            while (choice != OptionToContinue.EXIT) {
                Menu.printContinueOption();
                final int selection = readContinueOption(scanner);
                choice = getContinueOption(selection);
                selectContinueOption(choice, scanner);
            }
        }

    }

    /**
     * Prompts input for two people, creates them, and swaps their identities.
     *
     * @param scanner the Scanner object for user input
     */
    private static void changePeople(final Scanner scanner) {
        Menu.printMenuPerson1();
        final Person p1 = PersonUtils.createPerson(scanner);
        Menu.printMenuPerson2();
        final Person p2 = PersonUtils.createPerson(scanner);

        PersonUtils.changeIdentities(p1, p2);
    }

    /**
     * Reads the menu option selected by the user with input validation.
     *
     * @param scanner the Scanner object for user input
     * @return the selected option number
     */
    private static int readContinueOption(final Scanner scanner) {
        InputController.validateIntInput(scanner);
        final int choice = scanner.nextInt();
        scanner.nextLine();

        return choice;
    }

    /**
     * Maps an integer option to its corresponding model.OptionToContinue enum value.
     *
     * @param choice the integer choice entered by the user
     * @return the corresponding model.OptionToContinue enum constant
     */
    private static OptionToContinue getContinueOption(final int choice) {
        return switch (choice) {
            case 1 -> OptionToContinue.CONTINUE;
            case 2 -> OptionToContinue.EXIT;
            default -> OptionToContinue.UNKNOWN;
        };
    }

    /**
     * Executes the appropriate action based on the selected enum option.
     *
     * @param choice  the chosen model.OptionToContinue state
     * @param scanner the Scanner object for taking further input
     */
    private static void selectContinueOption(final OptionToContinue choice, final Scanner scanner) {
        switch (choice) {
            case CONTINUE -> changePeople(scanner);
            case EXIT -> System.out.println("\nGood Bye!");
            default -> System.out.println("\nInvalid option! Please try again.\n");
        }
    }
}
