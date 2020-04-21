package com.generics.calculator;

public class Calculator {
    public Number calculateUsingFactory(Number a, Number b, String operator) {
        Operation targetOperation = OperationFactory
                .getOperation(operator)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return targetOperation.apply(a, b);
    }
}
