package com.industriallogic.collections.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Belinda on 11/19/16.
 */
public class FizzBuzz {

    public String answer(int number){

        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new FizzBuzzRule());
        rules.add(new FizzRule());
        rules.add(new BuzzRule());

        for(Rule rule: rules){
            if(rule.check(number)){
                return rule.answer();
            }
        }

        return String.valueOf(number);
    }

}
