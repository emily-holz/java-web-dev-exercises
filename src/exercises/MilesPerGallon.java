package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?:");
        Float miles = input.nextFloat();

        System.out.println("How many gallons of gas have you used?:");
        Float gallons = input.nextFloat();

        Float mpg = miles/gallons;
        System.out.println("Your miles-per-gallon is: " + mpg + " mpg.");
    }
}
