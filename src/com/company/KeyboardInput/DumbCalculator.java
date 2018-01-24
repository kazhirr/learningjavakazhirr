 package com.company.KeyboardInput;
import java.util.Scanner;
public class DumbCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double n1, n2, n3;

        System.out.print("What is your first number? ");
        n1 = keyboard.nextDouble();

        System.out.print("What is your second number? ");
        n2 = keyboard.nextDouble();

        System.out.print("What is your third number? ");
        n3 = keyboard.nextDouble();

        System.out.print("(" + n1 + " + " + n2 + " + " + n3 + ") / 2 is... " + ((n1 + n2 + n3) / 2));
    }
}
