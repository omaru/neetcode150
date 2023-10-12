package com.omaru.neetcode150.usecase.arrays;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.MaxCounterRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.BDDAssertions.then;

@ExtendWith(MockitoExtension.class)
class MaxCounterTest {
    private UseCase<MaxCounterRequest, Integer[]> useCase;

    @BeforeEach
    void setUp() {
        useCase = new MaxCounter();
    }

    @Test
    void exampleOneTest() {
        MaxCounterRequest given = MaxCounterRequest.builder().
                N(5).A(new Integer[]{3, 4, 4, 6, 1, 4, 4}).build();

        Integer[] result = useCase.execute(given);

        then(result).containsSequence(3, 2, 2, 4, 2);
    }
}
