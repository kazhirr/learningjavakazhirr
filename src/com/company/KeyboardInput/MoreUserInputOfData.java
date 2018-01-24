package com.company.KeyboardInput;
import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);
        String fname, lname, login;
        int grade, id;
        double gpa;

        System.out.print("First name: ");
        fname = keyboard.next();

        System.out.print("Last name: ");
        lname = keyboard.next();

        System.out.print("Grade (9-12): ");
        grade = keyboard.nextInt();

        System.out.print("Student ID: ");
        id = keyboard.nextInt();

        System.out.print("Login: ");
        login = keyboard.next();

        System.out.print("GPA (0.0-4.0): ");
        gpa = keyboard.nextDouble();

        System.out.println("Your information:");
        System.out.println("        Login: " + login);
        System.out.println("        ID: " + id);
        System.out.println("        Name: " + lname + ", " + fname);
        System.out.println("        GPA: " + gpa);
        System.out.println("        Grade: " + grade);

    }
}
