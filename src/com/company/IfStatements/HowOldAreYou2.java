package com.company.IfStatements;
import java.util.Scanner;


public class HowOldAreYou2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Hey what's your name? ");
        name = keyboard.next();

        System.out.print("Ok, " + name + ", how old are" +
                " you? ");
        age = keyboard.nextInt();

        if (age < 16)
            System.out.println("You can't drive.");
        else if (age >= 16 && age <= 17)
            System.out.println("You can drive but not vote.");
        else if (age >= 18 && age <= 24)
            System.out.println("You can vote but not rent a car.");
        else if (age > 25)
            System.out.println("You can do pretty much anything");



    }
}
