package com.company.RandomNumbers;
import java.util.Random;

public class Randomness {
    public static void main(String args[]) {
        Random r = new Random();

        int x = 1 + r.nextInt(10);

        System.out.println("My random number is " + x); //The change of thing 3

        System.out.println("Here are some numbers from 1 to 5!");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        System.out.print(3 + r.nextInt(5) + " ");
        //The range of the numbers is now from 0 to 5 instead of 1 to 5
        //The range of the number is now from 3 to 7
        System.out.println();

        System.out.println("Here are some numbers from 1 to 100!");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.println();

        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if (num1 == num2)
            System.out.println("The random numbers were the same! Weird.");

        if (num1 != num2)
            System.out.println("The random numbers were different! Not too surprising, actually.");
    }
}
