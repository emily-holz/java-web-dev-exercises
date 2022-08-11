package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        Comparator flavorComparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();
        Comparator toppingComparator = new ToppingComparator();

        // TODO: Use a Comparator class to so
        //  rt the 'flavors' array alphabetically by the 'name'
        //  field.
        // TODO: Print the 'flavors' lists (in a clear manner) to verify the sorting.
        flavors.sort(flavorComparator);
        for (Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field
        // TODO: Print the 'cones' lists (in a clear manner) to verify the sorting.
        cones.sort(coneComparator);
        for (Cone cone: cones){
           System.out.println(cone);
        }

        //BONUS1
        flavors.sort(flavorComparator);
        for (Flavor flavor: flavors){
            System.out.println(flavor.getName() + ": " + flavor.getAllergens());
        }

        //BONUS2-choose how to sort toppings array
        toppings.sort(toppingComparator);
        for (Topping topping: toppings){
            System.out.println(topping.getName() + ": $" + topping.getCost());
        }


    }
}
