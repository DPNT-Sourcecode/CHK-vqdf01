package io.accelerate.solutions.CHK;

import io.accelerate.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        Map<Character,Integer> unit_price = new HashMap<Character,Integer>();
        unit_price.put('A',50);
        unit_price.put('B',30);
        unit_price.put('C',20);
        unit_price.put('D',15);

        //concludes the special offer table
        Map<Character,Integer> quantity = new HashMap<Character,Integer>();
        Map<Character,Integer> offer_price = new HashMap<Character,Integer>();
        quantity.put('A',3);
        offer_price.put('A',130);
        quantity.put('B',2);
        offer_price.put('B',45);

        //getting the count now
        Map<Character, Integer> counts = new HashMap<>();
        for (Character c : skus.toCharArray()) {
            if(!unit_price.containsKey(c)){
                return -1; //not throwing any Exception as it was mentioned to just retun -1
            }
        }




        throw new SolutionNotImplementedException();
    }
}



