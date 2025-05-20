package top.productivitytools.learning.java.graphql.demo.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private PersonAddress address;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
