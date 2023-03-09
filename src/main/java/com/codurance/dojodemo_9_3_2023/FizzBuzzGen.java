package com.codurance.dojodemo_9_3_2023;

public class FizzBuzzGen {
    public String generate(int input) {

        if(input % 3 == 0) return "Fizz";

        return String.valueOf(input);
    }
}
