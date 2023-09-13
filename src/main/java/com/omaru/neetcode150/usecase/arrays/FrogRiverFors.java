package com.omaru.neetcode150.usecase.arrays;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.FrogRiverRequest;

import static java.util.Objects.isNull;

public class FrogRiverFors implements UseCase<FrogRiverRequest, Integer> {
    @Override
    public Integer execute(FrogRiverRequest request) {
        Integer x = request.getX();
        Integer[] a = request.getA();
        Integer[] river = new Integer[x];
        for (int i = 0; i < a.length; i++) {
            int leaf = a[i];
            river[leaf-1] = 1;
            if (riverComplete(river)) {
                return i;
            }
        }
        return -1;
    }

    private boolean riverComplete(Integer[] river) {
        for (int i = 0; i < river.length; i++) {
            if (isNull(river[i])) {
                return false;
            }
        }
        return true;
    }
}
