package com.omaru.neetcode150.usecase.stacksandqueues;

import java.util.Map;
import java.util.Stack;

import static java.util.Objects.isNull;

public class Brackets implements com.omaru.neetcode150.usecase.UseCase<String, Boolean> {
    private Map<Character, Character> validBraces = Map.of('}', '{', ')', '(', ']', '[');

    @Override
    public Boolean execute(String input) {
        Stack<Character> brackets = new Stack<>();
        char[] braces = input.toCharArray();
        for (char brace : braces) {
            if (validBraces.values().contains(brace)) {
                brackets.push(brace);
            } else {
                if (isNull(validBraces.get(brace))) {
                    return false;
                }
                if (validBraces.get(brace).equals(brackets.peek())) {
                    brackets.pop();
                }
            }
        }
        return brackets.isEmpty();
    }
}
