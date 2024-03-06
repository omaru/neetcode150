package com.omaru.neetcode150.usecase.dp;

public class IsInSequence implements com.omaru.neetcode150.usecase.UseCase<Integer[], Boolean> {
    @Override
    public Boolean execute(Integer[] integers) {
        return isInSequence(integers, 0);
    }

    private boolean isInSequence(Integer[] input, int index) {
        if (index >= input.length - 1) {
            return true;
        }
        return (input[index] == input[index + 1] -1 && isInSequence(input, index + 1));
    }
}
