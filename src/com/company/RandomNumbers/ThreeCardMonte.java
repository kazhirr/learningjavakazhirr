package com.company.RandomNumbers;
import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Random r = new Random();
        int a = 1 + r.nextInt(3);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("You slide ub to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.");
        System.out.println();
        System.out.println("Which one is the ace?");

        System.out.println();
        System.out.println("##  ##  ##");
        System.out.println("##  ##  ##");
        System.out.println("1   2   3");

        System.out.print("> ");

        int n = keyboard.nextInt();

        if (n == a) {
            System.out.println("You nailed it! Fast Eddie reluctantly hand over your winnings, scowling");
            System.out.println();
             if (a == 1) {
                System.out.println("AA  ##  ##");
                System.out.println("AA  ##  ##");
                System.out.println("1   2   3");
            }
            else if (a == 2) {
                System.out.println("##  AA  ##");
                System.out.println("##  AA  ##");
                System.out.println("1   2   3");
            }
            else if (a == 3) {
                System.out.println("##  ##  AA");
                System.out.println("##  ##  AA");
                System.out.println("1   2   3");
            }

        }
    else {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + a);
            System.out.println();
            if (a == 1) {
                System.out.println("AA  ##  ##");
                System.out.println("AA  ##  ##");
                System.out.println("1   2   3");
            }
            else if (a == 2) {
                System.out.println("##  AA  ##");
                System.out.println("##  AA  ##");
                System.out.println("1   2   3");
            }
            else if (a == 3) {
                System.out.println("##  ##  AA");
                System.out.println("##  ##  AA");
                System.out.println("1   2   3");
            }
        }



    }
}
