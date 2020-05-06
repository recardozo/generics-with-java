package com.generics.wildcards.upperbounded;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class WildCardWithUpperBoundTest {

    @InjectMocks
    private WildCardWithUpperBoundExample wildCardWithUpperBoundExample;

    @Test
    public void upperBoundedIntegerTest() {
        List<Integer> a1 = Arrays.asList(10, 20, 30);
        wildCardWithUpperBoundExample.processElements(a1);
    }

    @Test
    public void upperBoundedLongTest() {
        List<Long> a2 = Arrays.asList(100L, 200L, 300L);
        wildCardWithUpperBoundExample.processElements(a2);
    }

    @Test
    public void upperBoundedDoubleTest() {
        List<Double> a3 = Arrays.asList(21.35, 56.47, 78.12);
        wildCardWithUpperBoundExample.processElements(a3);
    }

    @Test
    public void upperBoundedStringTest() {
        List<String> a4 = Arrays.asList("One", "Two", "Three");
        //This code is here just an example of what doesn't work. We have a compile error here.
        //wildCardWithUpperBoundExample.processElements(a4);
    }
}
