package com.webtest.app;

/**
 * Created by User on 2/07/2017.
 */
public class PrintAnimals {

    public static void main( String[] args ) {
        String[] animals = new String[]{"Lion","Tiger","Cheetah", "Leopard", "Puma"};

        int i=0;
        while (i < 5) {
        System.out.println("Animal " + animals[i]);
        i++;
        }

        System.out.println();



    }

}
