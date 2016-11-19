package com.industriallogic.collections.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Belinda on 11/19/16.
 */
public class FizzBuzzTest {

    @Test
    public void answer_given_1_return_1(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.answer(1);

        Assert.assertEquals("1", actual);
    }

    @Test
    public void answer_given_2_return_2(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.answer(2);

        Assert.assertEquals("2", actual);
    }
}
