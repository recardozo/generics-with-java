package com.generics.calculator;

public class Addition implements Operation<Double> {
    @Override
    public Double apply(Double numberOne, Double numberTwo) {
        return  numberOne+ numberOne;
    }
}
