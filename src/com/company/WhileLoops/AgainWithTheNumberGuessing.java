package com.company.WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        Random r = new Random();
        int n, i = 1 + r.nextInt(10), b = 1;

        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your guess: ");
        n = keyboard.nextInt();



       if (n != i) {
           do {
               b++;
               System.out.println("That is incorrect. Guess again.");
               System.out.print("Your guess: ");
               n = keyboard.nextInt();
           }
           while (n != i);
       }

        if (i == n) {
            System.out.println("That's right! You're a good guesser!");
            System.out.println("It only took you " + b + " tries.");
        }

    }
}
