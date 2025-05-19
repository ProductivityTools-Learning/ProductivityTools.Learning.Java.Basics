package top.productivitytools.learning.java.graphql.demo;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;

@Controller
public class AdditionController {
    @QueryMapping
    public Integer Add(@Argument Integer a, @Argument Integer b) {
        return a + b;
    }
}
