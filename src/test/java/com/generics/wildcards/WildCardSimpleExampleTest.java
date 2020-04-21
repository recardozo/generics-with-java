package com.generics.wildcards;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

@ExtendWith(MockitoExtension.class)
class WildCardSimpleExampleTest {

    @InjectMocks
    WildCardSimpleExample wildCardSimpleExample;

    @Test
    void printCollectionWithArray() {
        Collection<String> Arraylistcollection = new ArrayList<>();
        Arraylistcollection.add("ArrayList Collection");
        wildCardSimpleExample.printCollection(Arraylistcollection);
    }

    @Test
    void printCollectionWithLinkedList() {
        Collection<String> LinkedListcollection = new LinkedList<>();
        LinkedListcollection.add("LinkedList Collection");
        wildCardSimpleExample.printCollection(LinkedListcollection);
    }

    @Test
    void printCollectionWithHashSet() {
        Collection<String> HashSetcollection = new HashSet<>();
        HashSetcollection.add("HashSet Collection");
        wildCardSimpleExample.printCollection(HashSetcollection);
    }

}