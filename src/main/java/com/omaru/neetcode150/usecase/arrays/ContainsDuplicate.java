package com.omaru.neetcode150.usecase.arrays;

import com.omaru.neetcode150.usecase.UseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ContainsDuplicate implements UseCase<Integer[], Boolean> {
    @Override
    public Boolean execute(Integer[] integers) {
        return null;
    }
}
