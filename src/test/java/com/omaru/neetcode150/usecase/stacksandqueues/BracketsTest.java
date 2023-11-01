package com.omaru.neetcode150.usecase.stacksandqueues;

import com.omaru.neetcode150.usecase.UseCase;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.BDDAssertions.then;

class BracketsTest {
    private UseCase<String, Boolean> useCase;

    @BeforeEach
    void setUp() {
        useCase = new Brackets();
    }

    @ParameterizedTest
    @ValueSource(strings = {"{[()]}", "[]{}()[()]", "{[()]}"})
    void testBrackets(String given) {

        Boolean result = useCase.execute(given);

        then(result).isTrue();

    }

    @ParameterizedTest
    @ValueSource(strings = {"{[(]}#", "[a{}()[()]", "{[(_]}"})
    void testBracketsInvalidInput(String given) {

        Boolean result = useCase.execute(given);

        then(result).isFalse();

    }
}
