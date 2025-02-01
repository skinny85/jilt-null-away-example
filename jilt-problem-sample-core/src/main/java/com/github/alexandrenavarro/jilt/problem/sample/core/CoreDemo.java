package com.github.alexandrenavarro.jilt.problem.sample.core;

import org.jspecify.annotations.Nullable;

public class CoreDemo {
    public static void main(String[] args) {
        final Person person = Person.builder()
                .firstName(null)
                .lastName("Do")
                .build();
        System.out.println(person);
        System.out.println(printPerson(null));
    }

    public static String printPerson(Person person) {
        return person.toString();
    }

}
