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
        special_offers.put('P', new Offer[]{new Offer(5,200),new Offer(3,130)});
        special_offers.put('Q', new Offer[]{new Offer(5,200),new Offer(3,130)});
        special_offers.put('V', new Offer[]{new Offer(5,200),new Offer(3,130)});



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

        } if (counts.containsKey('F')){
            int countF = counts.get('F');
            int payableF = countF - (countF/3);
            counts.put('F',payableF);

        }
int total = 0;
        for(Map.Entry<Character,Integer> entry : counts.entrySet()){
            char sku = entry.getKey();
            int quantity  = entry.getValue();
            switch (sku) {
                case 'A'-> {
                    int groupof5 = quantity / 5;
                    quantity = quantity % 5;
                    int groupof3 = quantity / 3;
                    int reminder = quantity % 3;
                    total += groupof5 * 200 + groupof3 * 130 + reminder * 50;
                }
                case 'B'-> {
                    int groupof2 = quantity / 2;
                    int reminder = quantity % 2;
                    total += groupof2 * 45 + reminder * 30;
                }
                case 'C'-> total += quantity*20;
                case 'D'-> total += quantity*15;
                case 'E'-> total += quantity*40;
                case 'F'-> total += quantity*10;


            }

        }
        return 0;
    }
}



