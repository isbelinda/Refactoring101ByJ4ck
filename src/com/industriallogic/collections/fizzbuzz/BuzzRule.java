package com.industriallogic.collections.fizzbuzz;

/**
 * Created by Belinda on 11/19/16.
 */
public class BuzzRule {
    public static final String BUZZ = "Buzz";

    boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    public String answer(){
        return BUZZ;
    }
}
