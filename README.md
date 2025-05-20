### GraphQL
[Tutorial](https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/)

After running the application in we can open the page:
```localhost:8080/graphiql```


## Bugs repaired
- name of the method in the schema was capitalized and in the java file not
- if method does not have parameters, then in the schema we should not put ()
- for schema mapping, method needs to be named as property in the ```schema.graphqls```

```

type Person {
    firstName: String
    lastName: String
    personAddress: PersonAddress
}

    @SchemaMapping
    public PersonAddress personAddress(Person person) {
        return new PersonAddress("123 Main St");
    }
```