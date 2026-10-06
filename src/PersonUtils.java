import java.util.Scanner;

/**
 * Utility class providing helper methods for processing Person objects and handling console input.
 */
public class PersonUtils {

    /**
     * Swaps the identity data (name and age) between two people and prints the result.
     *
     * @param p1 the first person
     * @param p2 the second person
     */
    public static void changeIdentities(final Person p1, final Person p2) {
        final String name1 = p2.getName();
        final int age1 = p2.getAge();
        final String name2 = p1.getName();
        final int age2 = p1.getAge();

        p1.setName(name1);
        p1.setAge(age1);
        p2.setName(name2);
        p2.setAge(age2);

        System.out.println("\nNow the first person is: " + p1.getName() + ", " + p1.getAge());
        System.out.println("The second person is: " + p2.getName() + ", " + p2.getAge() + "\n");
    }


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

    /**
     * Creates a new Person object by reading name and age from console input.
     *
     * @param scanner the Scanner object for reading input
     * @return a new Person instance
     */
    public static Person createPerson(final Scanner scanner) {
        final Person person = new Person(readName(scanner), readAge(scanner));

        return person;
    }
}
