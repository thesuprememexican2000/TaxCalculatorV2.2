package com.example.ctc.BLL.Control;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CanadaTaxControllerTest {

    CanadaTaxController ctc;
    @BeforeEach
    void setUp() {
        ctc = new CanadaTaxController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getTax() {
        //arrange
        double expected = 44370;
        //act
        double result = ctc.getTax(153000);

        //assert
        Assertions.assertEquals(expected, result,1);
    }
}