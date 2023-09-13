package com.omaru.neetcode150.usecase.arrays;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.CyclicRotationRequest;

public class CyclicRotationModulus implements UseCase<CyclicRotationRequest, Integer[]> {
    @Override
    public Integer[] execute(CyclicRotationRequest request) {
        Integer[] result = new Integer[request.getA().length];
        for (int i = 0; i < result.length; i++) {
            result[(i + request.getK()) % request.getA().length] = request.getA()[i];
        }
        return result;
    }
}
