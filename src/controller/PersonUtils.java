package controller;

import model.Person;

import java.util.Scanner;

/**
 * Utility class providing helper methods for processing model.Person objects and handling console input.
 */
public class PersonUtils {

    /**
     * Swaps the identity data (name and age) between two people and prints the result.
     *
     * @param p1 the first person
     * @param p2 the second person
     */
    protected static void changeIdentities(final Person p1, final Person p2) {
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
     * Creates a new model.Person object by reading name and age from console input.
     *
     * @param scanner the Scanner object for reading input
     * @return a new model.Person instance
     */
    protected static Person createPerson(final Scanner scanner) {
        final String name = InputController.readName(scanner);
        final int age = InputController.readAge(scanner);
        final Person person = new Person(name, age);

        return person;
    }
}
