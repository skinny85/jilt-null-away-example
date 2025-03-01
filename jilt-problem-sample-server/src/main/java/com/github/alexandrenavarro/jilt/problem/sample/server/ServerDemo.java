package com.github.alexandrenavarro.jilt.problem.sample.server;

import com.github.alexandrenavarro.jilt.problem.sample.core.Person;
import com.github.alexandrenavarro.jilt.problem.sample.core.PersonBuilder;

import static com.github.alexandrenavarro.jilt.problem.sample.core.PersonBuilder.Optional.middleName;
import static com.github.alexandrenavarro.jilt.problem.sample.core.PersonBuilder.firstName;
import static com.github.alexandrenavarro.jilt.problem.sample.core.PersonBuilder.lastName;

public class ServerDemo {
    public static void main(String[] args) {
        final Person person = PersonBuilder.person(
//                .firstName(null) // triggers compilation failure
                firstName("null"),
                lastName("Do"),
                middleName(null)
        );
        System.out.println(person);
    }
}
