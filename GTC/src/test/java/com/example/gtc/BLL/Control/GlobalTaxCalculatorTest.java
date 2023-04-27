package com.example.gtc.BLL.Control;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GlobalTaxCalculatorTest {

    GlobalTaxCalculator gtc;
    @BeforeEach
    void setUp() {
        gtc = new GlobalTaxCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getTax() {
        //arrange
        double expected = 300;
        //act
        double result = gtc.getTax(1000);
        //assert
        Assertions.assertEquals(expected, result, 1);
    }

    @Test
    void testGetTax() {
    }
}