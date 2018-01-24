package com.company.RandomNumbers;
import java.util.Random;
import java.util.Scanner;

public class FortuneCookies {
    public static void main(String[] args) {
        Random r = new Random();
        int i = 1 + r.nextInt(6);

        int a = 1 + r.nextInt(54);
        int b = 1 + r.nextInt(54);
        int c = 1 + r.nextInt(54);
        int d = 1 + r.nextInt(54);
        int e = 1 + r.nextInt(54);
        int f = 1 + r.nextInt(54);

        if (i == 1)
            System.out.println("You will find happiness with a new love.");
        else if (i == 2)
            System.out.println("Stick with your wife");
        else if (i == 3)
            System.out.println("Do not squander your fortune, good things will come");
        else if (i == 4)
            System.out.println("You will perform a great deed soon");
        else if (i == 5)
            System.out.println("A sick family member will be cured");
        else if (i == 6)
            System.out.println("You will come across a large amount of money");

        System.out.println(a +" - " + b +" - " + c +" - " + d +" - " + e +" - " + f);
    }

}
