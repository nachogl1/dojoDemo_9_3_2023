package com.codurance.dojodemo_9_3_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGenShould {

    @Test
    void fizzBuzzGenInputOneThenReturnOne() {
        FizzBuzzGen gen = new FizzBuzzGen();

        String result = gen.generate(1);

        assertEquals("1", result);
    }
}
