package com.generics.wildcards.lowerbounded;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class WildCardWithLoweroundTest {

    @InjectMocks
    private WildCardWithLoweroundExample wildCardWithLoweroundExample;

    @Test
    public void lowerRoundIntegerTest() {
        List<Integer> a1 = Arrays.asList(10, 20, 30);
        wildCardWithLoweroundExample.processElements(a1);
    }

    @Test
    public void lowerRoundLongTest() {
        List<Long> a2 = Arrays.asList(100L, 200L, 300L);
        wildCardWithLoweroundExample.processElements(Collections.singletonList(a2));
    }
}
