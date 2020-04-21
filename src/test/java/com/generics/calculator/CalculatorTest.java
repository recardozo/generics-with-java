package com.generics.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @InjectMocks
    Calculator calculator;

    @Test
    public void additionTest() {
        Number number = calculator.calculateUsingFactory(Double.valueOf(5), Double.valueOf(5), "+");
        assertThat(number).isEqualTo(Double.valueOf(10));
    }

    @Test
    public void subtractionTest() {
        Number number = calculator.calculateUsingFactory(Double.valueOf(5), Double.valueOf(5), "-");
        assertThat(number).isEqualTo(Double.valueOf(0));
    }

    @Test
    public void multiplierTest() {
        Number number = calculator.calculateUsingFactory(Double.valueOf(5), Double.valueOf(5), "*");
        assertThat(number).isEqualTo(Double.valueOf(25));
    }

    @Test
    public void divisionTest() {
        Number number = calculator.calculateUsingFactory(Double.valueOf(5), Double.valueOf(5), "/");
        assertThat(number).isEqualTo(Double.valueOf(1));
    }
}
