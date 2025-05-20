package top.productivitytools.learning.java.graphql.demo;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import top.productivitytools.learning.java.graphql.demo.Objects.Person;
import top.productivitytools.learning.java.graphql.demo.Objects.PersonAddress;

@Controller
public class PersonController {
    @QueryMapping
    public Person getPerson() {
        return new Person("John", "Doe");
    }

    @SchemaMapping
    public PersonAddress personAddress(Person person) {
        return new PersonAddress("123 Main St");
    }
}
