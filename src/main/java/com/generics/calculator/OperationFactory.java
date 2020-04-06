package com.generics.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperationFactory {
    static Map<String,Operation> operationMap= new HashMap<>();
    static {
        operationMap.put("+",new Addition());
        operationMap.put("-",new Substraction());
        operationMap.put("*",new Multiplier());
        operationMap.put("/",new Division());
    }

    public static Optional<Operation> getOperation(String operation){
        return Optional.ofNullable(operationMap.get(operation));
    }
}
