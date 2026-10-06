package model;

/**
 * Represents a person entity holding basic identity details such as name and age.
 */
public class Person {
    private String name;
    private int age;

    /**
     * Constructs a new model.Person with the specified name and age.
     *
     * @param name the person's name
     * @param age  the person's age
     */
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException("Name cannot contain digits.");
            }
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 1 and 150.");
        }

        this.age = age;
    }
}


