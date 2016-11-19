package com.industriallogic.collections.fizzbuzz;

/**
 * Created by Belinda on 11/19/16.
 */
public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String answer(int number){
        if(number % 3 == 0 && number % 5 == 0){
            return FIZZ_BUZZ;
        }
        if(number % 3 == 0){
            return FIZZ;
        }

        if(number % 5 == 0){
            return BUZZ;
        }

        return String.valueOf(number);
    }
}
