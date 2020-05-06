package com.generics.methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class GenericMethodsTest {

    @InjectMocks
    private GenericMethods genericMethods;
    private List<Integer> integerList;
    private List<String> stringList;
    private List<String> stringListWithNumbers;

    @BeforeEach
    void setUp() {
        integerList = Arrays.asList(1, 2, 3, 4, 5);
        stringList = Arrays.asList("hello1", "hello2", "hello3", "hello4", "hello5");
        stringListWithNumbers= Arrays.asList("1", "2", "3", "4", "5");
    }

    @Test
    void fromArrayToList() {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> list = genericMethods.fromArrayToListWithUpperBound(intArray);
        assertThat(list).isEqualTo(integerList);
    }

    @Test
    void testFromArrayToList() {
        String[] stringArray = {"hello1", "hello2", "hello3", "hello4", "hello5"};
        List<String> strList = genericMethods.fromArrayToList(stringArray);
        assertThat(strList).isEqualTo(stringList);
    }

    @Test
    void fromArrayToListWithUpperBound() {
        Integer[] intArr = {1, 2, 3, 4, 5};
        List<String> strList = genericMethods.fromArrayToList(intArr, Object::toString);
        assertThat(strList).isEqualTo(stringListWithNumbers);
    }
}