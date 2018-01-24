package com.company.DoWhileLoops;
import java.util.Scanner;

public class CollatzSequence {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int n,x = 0;

        System.out.print("Starting number: ");
        n = keyboard.nextInt();
        int z = n;
        System.out.print(n + "      ");

        while (n != 1){
            x++;
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (n * 3) + 1;

            System.out.print(n + "      ");
            if (n > z)
                z = n;
        }
        System.out.println();

        System.out.println("Terminated after "+x+" steps. The largest value was "+z+".");
    }
}
