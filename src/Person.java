/**
 * Represents a person entity holding basic identity details such as name and age.
 */
public class Person {
    String name;
    int age;

    /**
     * Constructs a new Person with the specified name and age.
     *
     * @param name the person's name
     * @param age  the person's age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
