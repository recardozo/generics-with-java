package com.generics.wildcards.upperbounded;

import java.util.List;

public class WildCardWithUpperBoundExample {
    public void processElements(List<? extends Number> a) {
        for (Object element : a) {
            System.out.println(element);
        }
    }
}
