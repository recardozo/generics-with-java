package com.generics.typeparameter;

public class GenericMultipleTypeParametersExample {
 public static void main(String[] args) {
  OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
  System.out.println(p1.getKey());
  System.out.println(p1.getValue());
  
  OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
  System.out.println(p2.getKey());
  System.out.println(p2.getValue());
  
  OrderedPair<String, Employee>  p3 = new OrderedPair<>("key", new Employee("Ramesh"));
  System.out.println(p3.getKey());
  System.out.println(p3.getValue().getName());
 }
}
