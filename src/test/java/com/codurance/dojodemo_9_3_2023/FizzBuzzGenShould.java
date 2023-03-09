package com.codurance.dojodemo_9_3_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGenShould {

    @Test
    void returnOneIfOneIsTheInput() {
        FizzBuzzGen gen = new FizzBuzzGen();

        String result = gen.generate(1);

        assertEquals("1", result);
    }

    @Test
    void returnTwoIfTwoIsInput() {
        FizzBuzzGen gen = new FizzBuzzGen();

        String result = gen.generate(2);

        assertEquals("2", result);
    }

    @Test
    void returnFizzIfInputDivisibleByThree() {

        FizzBuzzGen gen = new FizzBuzzGen();

        String result = gen.generate(3);

        assertEquals("Fizz", result);
    }
}
