package io.accelerate.solutions.CHK;

import io.accelerate.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {

    static class Offer{
        int quantity;
        int price;
        Offer(int quantity, int price) {
            this.quantity = quantity;
        }
    }
    static class CrossOffer{
        char freeSku;
        int required;
        CrossOffer(char freeSku, int required) {
            this.freeSku = freeSku;
        }
    }

    public Integer checkout(String skus) {

        if (skus == null) {
            return -1;
        }
        if (skus.isEmpty()) {
            return 0;
        }
        Map<Character,Integer> unit_price = new HashMap<Character,Integer>();
        unit_price.put('A',50);
        unit_price.put('B',30);
        unit_price.put('C',20);
        unit_price.put('D',15);
        unit_price.put('E',40);
        unit_price.put('F',10);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('G',20);
        unit_price.put('y',20);
        unit_price.put('Z',50);
        //getting the count now

        Map<Character, Offer[]> special_offers = new HashMap<>();
        special_offers.put('A', new Offer[]{new Offer(5,200),new Offer(3,130)});
        special_offers.put('B', new Offer[]{new Offer(2,45)});
        special_offers.put('H', new Offer[]{new Offer(10,80),new Offer(5,45)});
        special_offers.put('K', new Offer[]{new Offer(2,150)});
        special_offers.put('P', new Offer[]{new Offer(5,200)});
        special_offers.put('Q', new Offer[]{new Offer(3,80)});
        special_offers.put('V', new Offer[]{new Offer(3,130),new Offer(2,90)});

        Map<Character, Integer> free_item_offers = Map.of('F',3,
                'U',4);
        Map<Character, CrossOffer> crossOffers = Map.of('E',new CrossOffer('B',2),
                'N',new CrossOffer('M',2),
                'R',new CrossOffer('Q',2));



        Map<Character, Integer> counts = new HashMap<>();
        for (Character c : skus.toCharArray()) {
            if(!unit_price.containsKey(c)){
                return -1; //not throwing any Exception as it was mentioned to just retun -1
            }
            counts.put(c,counts.getOrDefault(c,0)+1);
        }




        
        return 0;
    }
}






