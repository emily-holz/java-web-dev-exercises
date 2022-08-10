package exercises.technology;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){
        Laptop emilysMac = new Laptop(13, "gold");
        SmartPhone emilysIphone = new SmartPhone("AT&T", 6, "blue");
        Laptop normans = new Laptop(15, "gray");
        System.out.println(emilysMac.getId());
        System.out.println(normans.getId());
        System.out.println(emilysIphone.getId());
       // System.out.println(emilysMac.isUpdatedSoftware());
       // emilysMac.update();
      //  System.out.println(emilysMac.isUpdatedSoftware());
       // System.out.println(emilysIphone.isUpdatedSoftware());
       // emilysIphone.update();
       // System.out.println(emilysIphone.isUpdatedSoftware());
       // System.out.println(emilysIphone.getCarrier());
        //emilysIphone.updateCarrier("Verizon");
       // System.out.println(emilysIphone.getCarrier());
    }
}
