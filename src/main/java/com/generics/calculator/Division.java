package com.generics.calculator;

public class Division implements Operation<Double> {
    @Override
    public Double apply(Double numberOne, Double numberTwo) {
        return  numberOne/numberOne;
    }
}
