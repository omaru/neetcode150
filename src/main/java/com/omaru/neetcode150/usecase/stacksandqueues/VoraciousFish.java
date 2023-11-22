package com.omaru.neetcode150.usecase.stacksandqueues;

import com.omaru.neetcode150.usecase.UseCase;
import com.omaru.neetcode150.usecase.request.VoraciousFishRequest;

import java.util.Stack;

public class VoraciousFish implements UseCase<VoraciousFishRequest, Integer> {


    @Override
    public Integer execute(VoraciousFishRequest request) {
        Stack<Integer> fishes = new Stack<>();
        int survivors = 0;
        for (int i = 0; i < request.getWeightOfFish().length; i++) {
            Integer currentFishWeight = request.getWeightOfFish()[i];
            if (fishGoingLeft(request, i)) {
                fishes.push(currentFishWeight);
            } else {
                Integer previousFishWeight = fishes.isEmpty() ? Integer.MIN_VALUE : fishes.pop();
                while (previousFishWeight != Integer.MIN_VALUE && previousFishWeight < currentFishWeight) {
                    previousFishWeight = fishes.isEmpty() ? Integer.MIN_VALUE : fishes.pop();
                }
                if (previousFishWeight == Integer.MIN_VALUE) {
                    survivors += 1;
                } else {
                    fishes.push(previousFishWeight);
                }
            }
        }
        survivors += fishes.size();
        return survivors;
    }

    private boolean fishGoingLeft(VoraciousFishRequest request, int i) {
        return request.getDirectionOfTravelOfFish()[i] == 1;
    }
}
