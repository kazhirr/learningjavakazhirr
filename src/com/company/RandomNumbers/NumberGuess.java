package com.company.RandomNumbers;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        Random r = new Random();
        int n, i = 1 + r.nextInt(10);

        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your guess: ");
        n = keyboard.nextInt();

        if (i == n)
            System.out.println("That's right! My secret number was " + i + "!");
        else
            System.out.println("Sorry, but I was really thinking of " + i + ".");
    }
}
