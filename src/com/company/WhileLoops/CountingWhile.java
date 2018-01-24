package com.company.WhileLoops;
import java.util.Scanner;

public class CountingWhile {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it several times");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        System.out.println("How many times?");
        int t = keyboard.nextInt();


        int n = 0, c = 0;
        while (n < t){
            c += 10;
            System.out.println( (c) + ". " + message);
            n += 1; //if I delete this line it will keep printing the message above indefinitely
        }
    }
}
