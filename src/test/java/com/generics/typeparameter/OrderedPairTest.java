package com.generics.typeparameter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderedPairTest {

    @InjectMocks
    private OrderedPair orderedPair;

    @Test
    public void testStringAndInteger(){
        OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
    }

    @Test
    public void testStringAndString(){
        OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
        System.out.println(p2.getKey());
        System.out.println(p2.getValue());
    }

    @Test
    public void testStringAndEmployee(){
        OrderedPair<String, Employee>  p3 = new OrderedPair<>("key", new Employee("Ramesh"));
        System.out.println(p3.getKey());
        System.out.println(p3.getValue().getName());
    }
}
