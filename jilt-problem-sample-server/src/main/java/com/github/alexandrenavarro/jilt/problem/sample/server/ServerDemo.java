package com.github.alexandrenavarro.jilt.problem.sample.server;

import com.github.alexandrenavarro.jilt.problem.sample.core.Person;

public class ServerDemo {
    public static void main(String[] args) {
        final Person person = Person.builder()
//                .firstName(null) // triggers compilation failure
                .firstName("null")
                .lastName("Do")
                .middleName(null)
                .build();
        System.out.println(person);
    }
}
