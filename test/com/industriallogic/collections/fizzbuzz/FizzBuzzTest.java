package com.industriallogic.collections.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Belinda on 11/19/16.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void answer_given_1_return_1(){
        String actual = fizzBuzz.answer(1);

        Assert.assertEquals("1", actual);
    }

    @Test
    public void answer_given_2_return_2(){
        String actual = fizzBuzz.answer(2);

        Assert.assertEquals("2", actual);
    }

    @Test
    public void answer_given_3_return_fizz(){
        String actual = fizzBuzz.answer(3);

        Assert.assertEquals(FizzRule.FIZZ, actual);
    }

    @Test
    public void answer_given_9_return_fizz(){
        String actual = fizzBuzz.answer(9);

        Assert.assertEquals(FizzRule.FIZZ, actual);
    }

    @Test
    public void answer_given_6_return_fizz(){
        String actual = fizzBuzz.answer(6);

        Assert.assertEquals(FizzRule.FIZZ, actual);
    }

    @Test
    public void answer_given_5_return_buzz(){
        String actual = fizzBuzz.answer(5);

        Assert.assertEquals(BuzzRule.BUZZ, actual);
    }

    @Test
    public void answer_given_10_return_buzz(){
        String actual = fizzBuzz.answer(10);

        Assert.assertEquals(BuzzRule.BUZZ, actual);
    }

    @Test
    public void answer_given_20_return_buzz(){
        String actual = fizzBuzz.answer(20);

        Assert.assertEquals(BuzzRule.BUZZ, actual);
    }

    @Test
    public void answer_given_15_return_FizzBuzz(){
        String actual = fizzBuzz.answer(15);

        Assert.assertEquals(FizzBuzzRule.FIZZ_BUZZ, actual);
    }

    @Test
    public void answer_given_30_return_FizzBuzz(){
        String actual = fizzBuzz.answer(30);

        Assert.assertEquals(FizzBuzzRule.FIZZ_BUZZ, actual);
    }


}
