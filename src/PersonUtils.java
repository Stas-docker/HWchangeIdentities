import java.util.Scanner;

public class PersonUtils {
    public static void ChangeIdentities(final Person p1, final Person p2) {

        final String name1 = p2.name;
        final int age1 = p2.age;
        final String name2 = p1.name;
        final int age2 = p1.age;

        p1.name = name1;
        p1.age = age1;
        p2.name = name2;
        p2.age = age2;

        System.out.println("\nNow the first person is: " + p1.name + ", " + p1.age);
        System.out.println("The second person is: " + p2.name + ", " + p2.age + "\n");
    }

    public static String readName(final Scanner scanner) {

        final String name = scanner.nextLine();

        return name;
    }


    public static int readAge(final Scanner scanner) {

        validateIntInput(scanner);
        final int age = scanner.nextInt();
        scanner.nextLine();

        return age;
    }

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

    public static Person createPerson(final Scanner scanner) {

        final Person person = new Person(readName(scanner), readAge(scanner));

        return person;
    }
}
