package com.generics.calculator;

public interface Operation<T extends Number> {

    T  apply(T numberOne,T numberTwo);
}
