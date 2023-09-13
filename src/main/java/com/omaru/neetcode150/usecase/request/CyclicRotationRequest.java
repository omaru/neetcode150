package com.omaru.neetcode150.usecase.request;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CyclicRotationRequest {
    private Integer[] a;
    private Integer k;
}
