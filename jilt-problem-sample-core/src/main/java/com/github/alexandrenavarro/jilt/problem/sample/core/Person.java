package com.github.alexandrenavarro.jilt.problem.sample.core;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.jilt.Builder;
import org.jilt.BuilderStyle;
import org.jspecify.annotations.Nullable;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
@Builder(style = BuilderStyle.STAGED, factoryMethod = "builder")
public final class Person {
    private final String firstName;
    private final String lastName;
    @Nullable
    private final String middleName;

    public static PersonBuilders.FirstName builder() {
        return PersonBuilder.builder();
    }

}
