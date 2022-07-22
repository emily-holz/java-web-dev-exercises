package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String firstSentence = "Alice was beginning to get " +
                "very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she " +
                "had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought " +
                "Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Provide search term:");
        String searchTerm = input.next();

        Boolean contains = firstSentence.toLowerCase().contains(searchTerm);
        Integer indexOfSearchTerm = firstSentence.toLowerCase().indexOf(searchTerm);
        Integer lengthOfSearchTerm = searchTerm.length();

        System.out.println(contains);
        //System.out.println(indexOfSearchTerm);
        //System.out.println(lengthOfSearchTerm);

        System.out.println("Your search term first appears at index: "+ indexOfSearchTerm +". Your term is "+ lengthOfSearchTerm + " characters long.");
        String modifiedSentence = firstSentence.toLowerCase().replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}
