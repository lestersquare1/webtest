package com.webtest.app;

/**
 * Created by User on 2/07/2017.
 */
public class PrintEvenNumbers {

    public static void main( String[] args ) {

        String evenNumber = "Even number";

        int i=2;
        do {
            if (i % 2 == 0) {
                System.out.println(evenNumber + " " + i);
                }
        i++;

        } while(i < 31);


    }

}
