package com.generics.wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class WildCardSimpleExample {
    public static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Collection<String> Arraylistcollection = new ArrayList<>();
        Arraylistcollection.add("ArrayList Collection");
        printCollection(Arraylistcollection);

        Collection<String> LinkedListcollection = new LinkedList<>();
        LinkedListcollection.add("LinkedList Collection");
        printCollection(LinkedListcollection);

        Collection<String> HashSetcollection = new HashSet<>();
        HashSetcollection.add("HashSet Collection");
        printCollection(HashSetcollection);

    }
}