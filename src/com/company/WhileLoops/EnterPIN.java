package com.company.RandomNumbers;
import java.util.Scanner;

public class EnterPIN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOR PIN: ");
        int entry = keyboard.nextInt();

        while (entry != pin){
            entry = keyboard.nextInt();
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");

        }
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");

        //A while and an if statement are similar because of the fact that they impose a condition
        // execute the code

        //A while and an if statement are different because of the fact that the while statement executes an infinite number of times
        // until the condition is met while the if statement only executes the code if the condition is met if it is not the program either ends or continues

        //It would create a new variable over and over again

        //It will repeat the same message over and over again because of the fact that there is no prompt to stop the message input a value so the program will continue printing to
    }
}
