package com.webtest;

public class Leeds {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello World!");

        Leeds test = new Leeds();

        String country = "New Zealand";
        //Question1 from refactor-extract-variable
        final String Question1 = "What is the capital of ";
        System.out.println(Question1 + country + "?");
        System.out.println("The capital of " + country + " is " + test.getCapitalCityOf(country));

        country = "Australia";
        System.out.println(Question1 + country + "?");
        System.out.println("The capital of " + country + " is " + test.getCapitalCityOf(country));




    }

    public String getCapitalCityOf(String country) {
        String capital = "Not Found";

        //if ("New Zealand".equals(country)) {
        if ("New Zealand".equals(country)) {
            capital = "Wellington";

        }
        return capital;
    }
}
