package com.omaru.neetcode150.usecase.request;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class VoraciousFishRequest {
    Integer[] weightOfFish;
    Integer[] directionOfTravelOfFish;
}
