package com.omaru.neetcode150.usecase.dp;

import com.omaru.neetcode150.usecase.UseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class SequenceTest {
    private UseCase<Integer[], Boolean> isInSequence;

    @BeforeEach
    void setUp() {
        isInSequence = new IsInSequence();
    }

    @Test
    void isInSequence() {
        Integer[] input = {1, 2, 3, 4, 5};
        boolean result = isInSequence.execute(input);
        then(result).isTrue();
    }

    @Test
    void notSequence() {
        Integer[] input = {1, 2, 4, 5};
        boolean result = isInSequence.execute(input);
        then(result).isFalse();
    }
}
