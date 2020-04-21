package com.generics.wildcards;

import java.util.Collection;

public class WildCardSimpleExample {
    public void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
}