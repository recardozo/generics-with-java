package com.generics.wildcards.lowerbounded;

import java.util.List;

public class WildCardWithLoweroundExample {
    static void processElements(List<? super Integer> a) {
        for (Object element : a) {
            System.out.println(element);
        }
    }
}