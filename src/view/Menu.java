package view;

/**
 * Utility class responsible for displaying console menu messages and prompts to the user.
 */
public class Menu {

    /**
     * Prints the welcome message at the start of the game.
     */
    public static void printBeginning() {
        System.out.println("Hello! Let's change identities of two people\n");
    }

    /**
     * Displays the menu options for the user to continue or exit.
     */
    public static void printContinueOption() {
        System.out.println("Choose 1 if you want to continue.\n" +
                "Choose 2 if you want to finish game. ");
    }

    /**
     * Prints a prompt asking for the first person's details.
     */
    public static void printMenuPerson1() {
        System.out.println("\nPlease type the name and the age of the first person using enter: ");

    }

    /**
     * Prints a prompt asking for the second person's details.
     */
    public static void printMenuPerson2() {
        System.out.println("\nPlease type the name and the age of the second person using enter: ");
    }
}
