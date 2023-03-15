package usecase.arrays;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.arrays.ContainsDuplicate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.BDDAssertions.then;

@ExtendWith(MockitoExtension.class)
class ContainsDuplicateTest {
    private UseCase<Integer[], Boolean> useCase;

    @BeforeEach
    void setUp() {
        useCase = new ContainsDuplicate();
    }

    @Test
    void exampleOneTest() {
        Integer[] given = {1, 2, 3, 1};

        Boolean result = useCase.execute(given);

        then(result).isTrue();
    }


    @Test
    void exampleTwoTest() {
        Integer[] given = {1, 2, 3, 4};

        Boolean result = useCase.execute(given);

        then(result).isFalse();
    }

    @Test
    void exampleThreeTest() {
        Integer[] given = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        Boolean result = useCase.execute(given);

        then(result).isFalse();
    }
}
