package com.company.WhileLoops;
import java.util.Scanner;
import java.util.Random;

public class HiLoLimited {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int a = 1 + r.nextInt(100);

        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        System.out.print("Guess #1: ");
        int b = keyboard.nextInt(), c = 1;

        while(b != a && c < 7) {
            c++;
            if (b > a) {
                System.out.println("Sorry, that guess is too high.");
                System.out.print("Guess #" + c + ":");
                b = keyboard.nextInt();
            }
            else if (b < a) {
                System.out.println("Sorry, you are too low.");
                System.out.print("Guess #" + c + ": ");
                b = keyboard.nextInt();
            }
        }

        if(b != a)
            System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
         else if (b == a)
            System.out.println("You guessed it! What are the odds?!?");
    }
}
