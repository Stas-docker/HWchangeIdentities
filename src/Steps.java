import java.util.Scanner;

public class Steps {

    public static void startGame() {

        final Scanner scanner = new Scanner(System.in);

        OptionToContinue choice = OptionToContinue.UNKNOWN;
        Menu.beginning();

        while (choice != OptionToContinue.EXIT) {
            Menu.printContinueOption();
            int selection = readContinueOption(scanner);
            choice = getContinueOption(selection);
            selectContinueOption(choice, scanner);
        }
    }

    private static void changePeople(final Scanner scanner) {

        Menu.printMenuPerson1();
        final Person p1 = PersonUtils.createPerson(scanner);
        Menu.printMenuPerson2();
        final Person p2 = PersonUtils.createPerson(scanner);

        PersonUtils.сhangeIdentities(p1, p2);
    }

    private static int readContinueOption(final Scanner scanner) {

        PersonUtils.validateIntInput(scanner);
        int choice = scanner.nextInt();
        scanner.nextLine();

        return choice;
    }

    private static OptionToContinue getContinueOption(final int choice) {

        return switch (choice) {
            case 1 -> OptionToContinue.CONTINUE;
            case 2 -> OptionToContinue.EXIT;
            default -> OptionToContinue.UNKNOWN;
        };
    }

    private static void selectContinueOption(final OptionToContinue choice, final Scanner scanner) {

        switch (choice) {
            case CONTINUE -> changePeople(scanner);
            case EXIT -> System.out.println("\nGood Bye!");
            default -> System.out.println("\nInvalid option! Please try again.\n");
        }
    }
}
