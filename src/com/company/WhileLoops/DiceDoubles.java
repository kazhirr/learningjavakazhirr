package com.company.WhileLoops;
import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random r = new Random();
        int a = 1 + r.nextInt(6);
        int b  = 1 + r.nextInt(6);

        System.out.println("HERE COMES THE DICE!");

        while (a != b) {
            a = 1 + r.nextInt(6);
            b = 1 + r.nextInt(6);
            System.out.println("Roll #1: " + a);
            System.out.println("Roll #2: " + b);
            System.out.println("The total is " + (a + b));
        }

    }
}
