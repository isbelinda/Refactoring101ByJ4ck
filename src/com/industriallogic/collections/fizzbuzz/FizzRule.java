package com.industriallogic.collections.fizzbuzz;

/**
 * Created by Belinda on 11/19/16.
 */
public class FizzRule {
    public static final String FIZZ = "Fizz";

    boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public String answer(){
        return FIZZ;
    }
}
