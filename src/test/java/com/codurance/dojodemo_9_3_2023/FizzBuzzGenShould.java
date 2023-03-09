package com.codurance.dojodemo_9_3_2023;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGenShould {

    private FizzBuzzGen gen;

    @BeforeEach
    void setUp() {
        gen = new FizzBuzzGen();
    }

    @Test
    void returnOneIfOneIsTheInput() {

        String result = gen.generate(1);

        assertEquals("1", result);
    }

    @Test
    void returnTwoIfTwoIsInput() {

        String result = gen.generate(2);

        assertEquals("2", result);
    }

    @Test
    void returnFizzIfInputDivisibleByThree() {


        String result = gen.generate(3);

        assertEquals("Fizz", result);
    }

    @Test
    void returnBuzzIfInputDivisibleByFive() {

        String result = gen.generate(5);

        assertEquals("Buzz", result);

    }

    @Test
    void returnFizzBuzzIfInputDivisibleByFiveAndThree(){
        String result = gen.generate(15);
        assertEquals("FizzBuzz", result);
    }
}
