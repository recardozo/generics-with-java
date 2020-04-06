package com.generics.methods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericMethods {

    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
    }

    public static <T extends Number> List<T> fromArrayToListWithUpperBound(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> integerList = fromArrayToList(intArray);
        integerList.forEach(System.out::println);

        String[] stringArray = {"hello1", "hello2", "hello3", "hello4", "hello5"};
        List<String> stringList = fromArrayToList(stringArray);
        stringList.forEach(System.out::println);

        Integer[] integerArray = {1, 2, 3, 4, 5};
        List<String> strintFromIntegerList = fromArrayToList(integerArray, Object::toString);

        strintFromIntegerList.forEach(System.out::println);
    }
}
