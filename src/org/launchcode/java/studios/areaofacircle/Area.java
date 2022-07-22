package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("The radius of the circle is: ");
        Double radius = input.nextDouble();
        //Double PI = 3.14;
        //Double area = PI * radius * radius;

        Double area = Circle.getArea(radius);

        System.out.println(String.format("The area of a circle of a radius %s is: %s", radius, area));
    }
}
