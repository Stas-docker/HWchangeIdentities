import java.util.Scanner;

public class PersonUtils {
    public static void сhangeIdentities(final Person p1, final Person p2) {

        final String name1 = p2.getName();
        final int age1 = p2.getAge();
        final String name2 = p1.getName();
        final int age2 = p1.getAge();

        p1.setName(name1);
        p1.setAge(age1);
        p2.setName(name2);
        p2.setAge(age2);

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
