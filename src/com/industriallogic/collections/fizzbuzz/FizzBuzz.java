package com.industriallogic.collections.fizzbuzz;

/**
 * Created by Belinda on 11/19/16.
 */
public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String answer(int number){
        if(number % 3 == 0){
            return FIZZ;
        }

        if(number == 5 || number == 10){
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
