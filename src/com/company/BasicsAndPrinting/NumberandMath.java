package com.company.BasicsAndPrinting;

public class NumberandMath {
    public static void main(String args[]) {
        System.out.println("I will now count my chickens:");
        //Addition and subtraction
        System.out.println("Hens " + ((25.0+30.0)/6));
        //Subtracts, multiplies and gives the remainder of a division
        System.out.println("Roosters " + (100.0 - 25.0) * (3 % 4));

        System.out.println("Now I will count the eggs:");
        //Addition, subtraction, modulo and division
        System.out.println((3.0 + 2.0 + 1.0 - 5.0) + (4 % 2.0) - (1.0 / (4.0 + 6.0)));

        System.out.println("Is it true that 3 + 2 < 5 - 7?");
        //Checks if 3 + 2 < 5 - 7 is true
        System.out.println((3.0 + 2.0) < (5.0 - 7.0));
        //Addition and subtraction
        System.out.println("What is 3 + 2? " + (3.0 + 2.0));
        System.out.println("What is 5 - 7? " + (5.0 -7.0));

        System.out.println( "Oh, that's why it's false." );

        System.out.println("How about some more.");
        //Checks if the operation is true
        System.out.println("Is it greater? " +(5.0 > -2.0));
        System.out.println("Is it greater or equal? " + (5.0 >= -2.0));
        System.out.println("is it less or equal " + (5.0 <= -2.0));



    }
}
