package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer>  numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        ArrayList<String> words =  new ArrayList<>();
        words.add("hello");
        words.add("strings");
        words.add("raise");

        System.out.println(sumOfEven(numbers));


        findFiveLetters(words);

    }

    public static int sumOfEven(ArrayList<Integer> numbers){
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) % 2 == 0){
                sum += numbers.get(i);
            }
        }
        return sum;
    }

    public static void findFiveLetters(ArrayList<String> words){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length:");
        int numChars = input.nextInt();

        for (int i = 0; i < words.size(); i++){
            if (words.get(i).length() == numChars){
                System.out.println(words.get(i));
            }
        }
    }
}
