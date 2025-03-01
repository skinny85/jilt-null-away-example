package com.github.alexandrenavarro.jilt.problem.sample.core;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

import static com.github.alexandrenavarro.jilt.problem.sample.core.PersonBuilder.Optional.middleName;
import static com.github.alexandrenavarro.jilt.problem.sample.core.PersonBuilder.firstName;
import static com.github.alexandrenavarro.jilt.problem.sample.core.PersonBuilder.lastName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PersonTest {
    @Test
    void test_person_builder() {
        Person person = PersonBuilder.person(
//                firstName(null), // triggers compilation failure and IDE warning
                firstName("null"),
                lastName("Do"),
                middleName(null)
        );
        assertNotNull(person);

        // uncomment this to see a compilation error from NullAway
//        System.out.println(printPerson(null));
    }

    @Test
    void check_person_builder_annotations() {
        Annotation[] annotations = PersonBuilder.class.getAnnotations();
        assertEquals(0, annotations.length);
    }

    private static String printPerson(Person person) {
        return person.toString();
    }
}
