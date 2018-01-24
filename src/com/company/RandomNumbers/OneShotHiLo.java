package com.company.RandomNumbers;
import java.util.Scanner;
import java.util.Random;

public class OneShotHiLo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int a = 1 + r.nextInt(100);

        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        System.out.print(">  ");
        int b = keyboard.nextInt();

        if (b < a)
            System.out.println("Sorry, you are too low. I was thinking of " + a);
        else if (b > a)
            System.out.println("Sorry, you are too high. I was thinking of " + a);
        else if (b == a)
            System.out.println("Holy crap you guessed it! What are the odds?");
    }
}
