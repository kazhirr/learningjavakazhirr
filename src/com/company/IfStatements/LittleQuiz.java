package com.company.IfStatements;
import java.util.Scanner;

public class LittleQuiz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i, t = 0;

        System.out.print("Are you ready for a quiz? ");
        keyboard.next();
        System.out.println("Okay, here it comes!");

        System.out.println("Q1) What is the capital of Alaska?");
        System.out.println("        1) Melbourne");
        System.out.println("        2) Anchorage");
        System.out.println("        3) Juneau");

        System.out.print("> ");
        i = keyboard.nextInt();

        if(i == 3) {
            System.out.println("That's right!");
            t = t + 1;
        }
        else
            System.out.println("Wrong it's Juneau!");

        System.out.println("Q2) Can you store the value \"cat\"");
        System.out.println("        1) yes");
        System.out.println("        2) no");
        System.out.print("> ");
        i = keyboard.nextInt();

        if (i == 2) {
            t = t + 1;
            System.out.println("That's right");
        }
        else System.out.println("Sorry, \"cat\" is a string. int can only store numbers.");


        System.out.println("Q3) What the is the result of 9+6/3?");
        System.out.println("        1) 5");
        System.out.println("        2) 11");
        System.out.println("        3) 15/3");

        System.out.print("> ");
        i = keyboard.nextInt();

        if (i == 2) {
            t = t + 1;
            System.out.println("That's correct!");
        }
        System.out.println("Overall, you got " + t +" out of 3 correct.");
        System.out.println("Thanks for playing!");

    }
}
