package com.example.qtc.BLL.Control;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuebecTaxControllerTest {
    QuebecTaxController qtc;

    @BeforeEach
    void setUp() {
        qtc = new QuebecTaxController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getTax() {
        //arrange
        double expected = 6000;
        //act
        double result = qtc.getTax(40000);
        //assert
        Assertions.assertEquals(expected, result, 1);
    }
}