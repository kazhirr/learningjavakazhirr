package com.company.ForLoops;
import java.util.Scanner;

public class AddingValuesForLoop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a = 0, b = 0, c = 0;
        System.out.print("Number: " );
        a = kb.nextInt();

        for (b = 1; b <= a; b++ ) {
            System.out.println(b);
            c =  c + b;
        }
        System.out.println("The sum is " + c);
    }
}
