package com.omaru.neetcode150.usecase.arrays;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.arrays.request.CyclicRotationRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class CyclicRotationModulusTest {
    private UseCase<CyclicRotationRequest, Integer[]> useCase;

    @BeforeEach
    void setUp() {
        useCase = new CyclicRotationModulus();
    }

    @Test
    void shouldRotateOne() {
        CyclicRotationRequest given = CyclicRotationRequest.builder()
                .a(new Integer[]{1, 2, 3, 4, 5})
                .k(1).build();

        Integer[] result = useCase.execute(given);

        then(result).containsSequence(5, 1, 2, 3, 4);
    }

    @Test
    void shouldRotateTwo() {
        CyclicRotationRequest given = CyclicRotationRequest.builder()
                .a(new Integer[]{1, 2, 3, 4, 5})
                .k(2).build();

        Integer[] result = useCase.execute(given);

        then(result).containsSequence(4, 5, 1, 2, 3);
    }

    @Test
    void shouldRotateThree() {
        CyclicRotationRequest given = CyclicRotationRequest.builder()
                .a(new Integer[]{1, 2, 3, 4, 5})
                .k(3).build();

        Integer[] result = useCase.execute(given);

        then(result).containsSequence(3, 4, 5, 1, 2);
    }

    @Test
    void shouldRotateFour() {
        CyclicRotationRequest given = CyclicRotationRequest.builder()
                .a(new Integer[]{1, 2, 3, 4, 5})
                .k(4).build();

        Integer[] result = useCase.execute(given);

        then(result).containsSequence(2, 3, 4, 5, 1);
    }

    @Test
    void shouldRotateFive() {
        CyclicRotationRequest given = CyclicRotationRequest.builder()
                .a(new Integer[]{1, 2, 3, 4, 5})
                .k(5).build();

        Integer[] result = useCase.execute(given);

        then(result).containsSequence(1, 2, 3, 4, 5);
    }
}
