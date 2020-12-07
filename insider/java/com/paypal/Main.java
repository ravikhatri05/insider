package com.paypal;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /**
     *
     * Write code to convert a string to integer.
     * Ex: "25" should give 25
     * Ex: "50 words are given" should give 50
     * Ex: "In general you have 4 interviews" should give 4
     *
     *1st approach
     *   iterating every character
     *
     * 2nd approach
     *   regular expression
     *
     *   1. positive integer
     *   2. negative integer
     *   3. decimal (positive and neagtive)
     *   4. 10*10^2
     *   5. your balance is Rs. 2,00,000.00/-    //- 200000.00
     *   6. [0-9]^
     * absatrct pattern
     */

    public static void main(String arg[]){
        HashSet<String> set =new HashSet<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","0"));
        HashSet<String> specialChar = new HashSet<>(Arrays.asList(".",","));
        String input="your balance is Rs. 2,00,000.00/-";
        //input = input.replace(",", "");
        StringBuilder output = new StringBuilder();
        char [] chars = input.toCharArray();
        int index = -1;
        for(int i=0;i<chars.length;i++){
            if(set.contains(chars[i]+"")){
                if(index!=-1 && index == i-1){
                    output.append(chars[i]+"");
                }else {
                    output.append(" "+chars[i]+"");
                }
                index =i;
            }else if(specialChar.contains(chars[i]+"")){
                if(index!=-1 && index == i-1){
                    output.append(chars[i]+"");
                }
            }
        }
        System.out.println(output.toString());

      /*  String data = "your balance is Rs. 2,00,000.00/-";
        data = data.replace(",", "");
        //Regular expression to digits
        String regex = "([0-9 .]+)";
        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(data);
        System.out.println("Digits in the given string are: ");
        while(matcher.find()) {
            System.out.print(matcher.group()+" ");
        }*/

        /*

        EUR/USD => 1.2
USD/GBP => 0.75
GBP/AUD => 1.7
AUD/JPY => 90
GBP/JPY => 150
JPY/INR => 0.6
EUR/AUD
AUD/EURO

{"EUR":["USD"]
 "USD":["EUR","GBP"]
 ""
 ""}

 {"EURO/USD",1.2
 }


         */
        HashMap<CurrType,Double> currencyMapping =new HashMap<>();
        HashMap<String, List<String>> currencyTypeMapping = new HashMap<String, List<String>>();
        Iterator<CurrType> itr =currencyMapping.keySet().iterator();
        while(itr.hasNext()){
                CurrType currType = itr.next();
                if(currencyTypeMapping.containsKey(currType.getFrom())){
                   List<String> list = currencyTypeMapping.get(currType.getFrom());
                   list.add(currType.getTo());
                } else{
                    List<String> list = new LinkedList<>();
                    list.add(currType.getTo());
                    currencyTypeMapping.put(currType.getFrom(),list);
                }

            if(currencyTypeMapping.containsKey(currType.getTo())){
                List<String> list = currencyTypeMapping.get(currType.getTo());
                list.add(currType.getFrom());
            } else{
                List<String> list = new LinkedList<>();
                list.add(currType.getFrom());
                currencyTypeMapping.put(currType.getTo(),list);
            }


        }

        //HashMap<String, List<String>> currencyTypeMapping = new HashMap<CurrType, List<CurrType>>();





    }

    class CurrType{
        String from ;
        String to;

        public String getFrom(){
            return from;
        }

        public String getTo(){
            return to;
        }

        @Override
        public int hashCode() {
            return (this.from+this.to).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
}
