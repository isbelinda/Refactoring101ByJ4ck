package com.industriallogic.collections.fizzbuzz;

/**
 * Created by Belinda on 11/19/16.
 */
public class FizzRule implements Rule {
    public static final String FIZZ = "Fizz";

    public boolean check(int number) {
        return number % 3 == 0;
    }

    public String answer(){
        return FIZZ;
    }
}
