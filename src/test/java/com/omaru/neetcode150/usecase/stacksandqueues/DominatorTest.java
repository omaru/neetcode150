package com.omaru.neetcode150.usecase.stacksandqueues;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.DominatorRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class DominatorTest {
    private UseCase<DominatorRequest, Integer> dominator;

    @BeforeEach
    void setUp() {
        dominator = new Dominator();
    }

    @Test
    void shouldHaveLeader() {
        DominatorRequest request = DominatorRequest.builder().sequence(new Integer[]{3, 4, 2, 3, 3, 2, 3}).build();
        Integer result = dominator.execute(request);
        then(result).isEqualTo(3);
    }

}
