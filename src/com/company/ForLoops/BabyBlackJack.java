package com.company.ForLoops;
import java.util.Random;

public class BabyBlackJack {
    public static void main(String[] args) {
        Random r = new Random();
        int b = 1 + r.nextInt(10), a = 1 + r.nextInt(10);

        System.out.println("Baby BlackJack!");
        System.out.println();

        System.out.println("You drew " + (a) + " and " + (b) );
        System.out.println("Your total is " + (a + b));
    }
}
