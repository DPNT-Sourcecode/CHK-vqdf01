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
        unit_price.put('E',40);

        //concludes the special offer table
//        Map<Character,Integer> quantity = new HashMap<Character,Integer>();
//        Map<Character,Integer> offer_price = new HashMap<Character,Integer>();
//        quantity.put('A',3);
//        offer_price.put('A',130);
//        quantity.put('B',2);
//        offer_price.put('B',45);

        //getting the count now
        Map<Character, Integer> counts = new HashMap<>();
        for (Character c : skus.toCharArray()) {
            if(!unit_price.containsKey(c)){
                return -1; //not throwing any Exception as it was mentioned to just retun -1
            }
            counts.put(c,counts.getOrDefault(c,0)+1);
        }
        if (counts.containsKey('E')&& counts.containsKey('B')){
            int freeB = counts.get('E')/2;
            int currentB = counts.get('B');
            int remainingB = Math.max(0, currentB-freeB);
            counts.put('B',remainingB);

        }
int total = 0;
        for(Map.Entry<Character,Integer> entry : counts.entrySet()){
            char sku = entry.getKey();
            int quantity  = entry.getValue();
            switch (sku) {
                case 'A': {
                    int groupof5 = quantity / 5;
                    quantity = quantity % 5;
                    int groupof3 = quantity / 3;
                    int reminder = quantity % 3;
                    total + = groupof5 * 200 + groupof3 * 130 + reminder * 50;
                }
                case 'B': {
                    int groupof2 = quantity / 2;
                    int reminder = quantity % 2;
                }

            }

        }
        return total;
    }
}






