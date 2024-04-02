package com.omaru.neetcode150.usecase.stacksandqueues;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.DominatorRequest;

public class Dominator implements UseCase<DominatorRequest, Integer> {
    @Override
    public Integer execute(DominatorRequest request) {
        int consecutiveSize = 0;
        int candidate = Integer.MIN_VALUE;
        for (int item : request.getSequence()) {
            if (consecutiveSize == 0) {
                candidate = item;
                consecutiveSize += 1;
            } else if (candidate == item) {
                consecutiveSize += 1;
            } else {
                consecutiveSize -= 1;
            }
        }
        int ocurrence = 0;
        for (int item : request.getSequence()) {
            if (item == candidate) {
                ocurrence += 1;
            }
        }
        return ocurrence > request.getSequence().length / 2.0 ? candidate : -1;
    }
}
