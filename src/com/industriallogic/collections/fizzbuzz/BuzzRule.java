package com.industriallogic.collections.fizzbuzz;

/**
 * Created by Belinda on 11/19/16.
 */
public class BuzzRule implements Rule {
    public static final String BUZZ = "Buzz";

    public boolean check(int number) {
        return number % 5 == 0;
    }

    public String answer(){
        return BUZZ;
    }
}
