package com.industriallogic.collections.fizzbuzz;

/**
 * Created by Belinda on 11/19/16.
 */
public class FizzBuzzRule {
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public boolean isFizzBuzz(int number) {
        return new FizzRule().isFizz(number) && new BuzzRule().isBuzz(number);
    }

    public String answer() {
        return FIZZ_BUZZ;
    }
}
