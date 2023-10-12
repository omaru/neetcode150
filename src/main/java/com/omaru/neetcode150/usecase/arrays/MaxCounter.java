package com.omaru.neetcode150.usecase.arrays;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.MaxCounterRequest;

import java.util.Arrays;

public class MaxCounter implements UseCase<MaxCounterRequest, Integer[]> {
    @Override
    public Integer[] execute(MaxCounterRequest request) {
        Integer[] counters = new Integer[request.getN()];
        Arrays.fill(counters, 0);
        int startLine = 0;
        int currentMax = 0;
        for (int i : request.getA()) {
            int x = i - 1;
            if (i > request.getN()) {
                startLine = currentMax;
            } else if (counters[x] < startLine) {
                counters[x] = startLine + 1;
            } else {
                counters[x] += 1;
            }
            if (i <= request.getN() && counters[x] > currentMax) {
                currentMax = counters[x];
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < startLine) {
                counters[i] = startLine;
            }
        }
        return counters;
    }
}
