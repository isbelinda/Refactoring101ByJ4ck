package com.industriallogic.collections.fizzbuzz;

/**
 * Created by Belinda on 11/19/16.
 */
public class FizzBuzz {

    public String answer(int number){
        BuzzRule buzzRule = new BuzzRule();
        FizzRule fizzRule = new FizzRule();
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();

        if(fizzBuzzRule.isFizzBuzz(number)){
            return fizzBuzzRule.answer();
        }
        if(fizzRule.isFizz(number)){
            return fizzRule.answer();
        }

        if(buzzRule.isBuzz(number)){
            return buzzRule.answer();
        }

        return String.valueOf(number);
    }

}
