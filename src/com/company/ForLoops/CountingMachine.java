package com.company.ForLoops;
import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, m;

        System.out.print("Count to: ");
        n = keyboard.nextInt();

        for (m = 1; m <= n; m++){
            System.out.print(m  + " ");
        }


    }
}
