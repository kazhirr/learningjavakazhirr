package com.company.DoWhileLoops;
import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = 3, b = 3, c = 3, thismany;
        String choice;

        do {
            System.out.println();
            System.out.println("A: "+a+"    B: "+b+"    C: "+c);
            System.out.print("Choose a pile: ");
            choice = keyboard.next();
            System.out.print("How many to remove from pile " + choice +": ");
            thismany = keyboard.nextInt();

            if (choice.equals("A"))
                a -= thismany;
            else if (choice.equals("B"))
                b -= thismany;
            else if (choice.equals("C"))
                c -= thismany;
            else
                System.out.println("ERROR WRONG LETTER! TRY AGAIN");
        } while ((a > 0) || (b > 0) || (c > 0));
    }
}
