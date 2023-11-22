package com.omaru.neetcode150.usecase.stacksandqueues;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.VoraciousFishRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class VoraciousFishTest {
    private UseCase<VoraciousFishRequest, Integer> useCase;

    @BeforeEach
    void setUp() {
        useCase = new VoraciousFish();
    }

    @Test
    void fishMove1() {
        VoraciousFishRequest request = VoraciousFishRequest.builder()
                .weightOfFish(new Integer[]{4, 3, 2, 1, 5}).directionOfTravelOfFish(new Integer[]{0, 1, 0, 0, 0}).build();

        Integer result = useCase.execute(request);

        then(result).isEqualTo(2);
    }
}
