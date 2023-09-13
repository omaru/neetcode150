package com.omaru.neetcode150.usecase.arrays;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.FrogRiverRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class FrogRiverConstantTest {
    private UseCase<FrogRiverRequest, Integer> useCase;

    @BeforeEach
    void setUp() {
        useCase = new FrogRiverConstant();
    }

    @Test
    void shouldJumpFirst() {
        FrogRiverRequest request = FrogRiverRequest.builder()
                .x(5).a(new Integer[]{1, 3, 1, 4, 2, 3, 5, 4}).build();

        int response = useCase.execute(request);

        then(response).isEqualTo(6);
    }
}
