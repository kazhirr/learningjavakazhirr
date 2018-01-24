package com.company.WhileLoops;
import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = 0, b = 0;

        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        a = keyboard.nextInt();
        b = a + b;
        System.out.println("The total so far is " + b);

        while (a != 0) {
            System.out.print("Number: ");
            a = keyboard.nextInt();
            b = a + b;
            System.out.println("The total so far is " + b);
        }
    }
}
