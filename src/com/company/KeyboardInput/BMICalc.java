package com.company.KeyboardInput;
import java.util.Scanner;

public class BMICalc {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        float height, heightf, heighti;
        float weight;

        System.out.print("Your height (feet only): ");
        heightf = keyboard.nextFloat();

        System.out.print("Your height (inches: ");
        heighti = keyboard.nextFloat();

        System.out.print("Your weight in pounds: ");
        weight = keyboard.nextInt();

        heightf = heightf * 12;
        weight = weight * 0.45359237f;
        height = (heightf + heighti) * 0.0254f;

        System.out.println("Your BMI is " + (weight / (height*height)));

    }
}
