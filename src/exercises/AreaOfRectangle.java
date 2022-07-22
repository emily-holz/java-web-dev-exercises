package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?:");
        Float length = input.nextFloat();

        System.out.println("What is the width of the rectangle?:");
        Float width = input.nextFloat();

        Float area = length*width;
        System.out.println("The area of your rectangle is: " + area);

    }

}
