package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class CountingCharactersStudio {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a quote.");
        String quote = input.nextLine();


        /*String quote = "If the product of two terms is " +
                "zero then common sense says at least " +
                "one of the two terms has to be zero to " +
                "start with. So if you move all the terms" +
                " over to one side, you can put the " +
                "quadratics into a form that can be " +
                "factored allowing that side of the " +
                "equation to equal zero. Once you’ve done" +
                " that, it’s pretty straightforward " +
                "from there.";*/

        char[] charactersInString = quote.toCharArray();

        HashMap<Character,Integer> charcount = new HashMap<>();

        for (char ch: charactersInString){
            if (charcount.containsKey(ch)){
                int valueCount = charcount.get(ch);
                charcount.replace(ch, valueCount+1);
            } else {
                charcount.put(ch,1);
            }
        }

        for (Map.Entry<Character, Integer> chars : charcount.entrySet()){
            System.out.println(String.format("%s : %s", chars.getKey(), chars.getValue()));
        }
       // System.out.println(charcount);
    }
}
