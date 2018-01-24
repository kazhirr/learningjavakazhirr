package com.company.IfStatements;
import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double weight;

        System.out.print("PLease enter your current earth weight: ");
        double eweight = keyboard.nextDouble();

        System.out.println("I have information for the planets:");
        System.out.println("  1. Venus    2. Mars   3. Jupiter");
        System.out.println("  4. Saturn   5. Uranus 6. Neptune");

        System.out.print("Which planet are you visiting? ");
        int planet = keyboard.nextInt();


        if (planet == 1)
                    weight = eweight * 0.78;

        else if (planet == 2)
                    weight = eweight * 0.39;

        else if (planet == 3)
                    weight = eweight * 2.65;

        else if (planet == 4)
                    weight = eweight * 1.17;

        else if (planet == 5)
                    weight = eweight * 1.05;

        else if (planet == 6)
                    weight = eweight * 1.23;

        else
            System.out.println("Please pick an actual planet.");

        System.out.println("Your weight would be 49.92 pounds on that planet.");


    }
}
