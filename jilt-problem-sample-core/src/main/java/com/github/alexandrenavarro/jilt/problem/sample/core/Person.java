package com.github.alexandrenavarro.jilt.problem.sample.core;

import lombok.AccessLevel;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NonNull;
import org.jilt.Builder;
import org.jilt.BuilderStyle;
import org.jspecify.annotations.Nullable;

@Data
@lombok.Builder(access = AccessLevel.PRIVATE)
@Builder(style = BuilderStyle.FUNCTIONAL, toBuilder = "toBuilder")
public final class Person {
    @NonNull private final String firstName;
    @NonNull private final String lastName;

    @Nullable
    @Default
    private final String middleName = null;

    public static PersonBuilders.FirstName builder() {
        throw new RuntimeException();
    }
}
