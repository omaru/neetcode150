package com.omaru.neetcode150.usecase.arrays;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.CyclicRotationRequest;

import static java.util.Objects.isNull;

public class CyclicRotation implements UseCase<CyclicRotationRequest, Integer[]> {
    @Override
    public Integer[] execute(CyclicRotationRequest request) {
        Integer[] a = request.getA();
        for (int rotations = 0; rotations < request.getK(); rotations++) {
            Integer nextElement = null;
            for (int y = 0; y < a.length; y++) {
                if (isNull(nextElement)) {
                    int element = a[y];
                    nextElement = a[y + 1];
                    a[y + 1] = element;
                } else if ((y + 1 < a.length)) {
                    int temp = a[y + 1];
                    a[y + 1] = nextElement;
                    nextElement = temp;
                } else {
                    a[0] = nextElement;
                }

            }
        }
        return a;
    }
}
