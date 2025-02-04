package com.github.alexandrenavarro.jilt.problem.sample.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PersonTest {
    @Test
    void test_person_builder() {
        final Person person = Person.builder()
                .firstName(null)
                .lastName("Do")
                .middleName(null)
                .build();
        assertNotNull(person);

        // uncomment this to see a compilation error from NullAway
//        System.out.println(printPerson(null));
    }

    private static String printPerson(Person person) {
        return person.toString();
    }
}
