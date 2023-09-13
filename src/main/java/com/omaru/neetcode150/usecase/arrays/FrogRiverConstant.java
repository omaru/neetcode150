package com.omaru.neetcode150.usecase.arrays;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.FrogRiverRequest;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverConstant implements UseCase<FrogRiverRequest, Integer> {

    @Override
    public Integer execute(FrogRiverRequest request) {
        Integer x = request.getX();
        Integer[] a = request.getA();
        Integer riverLength = x * (1 + x / 2);
        int bridgeLength = 0;
        Set<Integer> summed = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (!summed.contains(a[i])) {
                bridgeLength += a[i];
                summed.add(a[i]);
            }
            if (bridgeLength == riverLength) {
                return i;
            }
        }
        return -1;
    }
}
