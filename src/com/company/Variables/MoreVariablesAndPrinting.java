package com.company.Variables;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;

        Name = "FJ";
        Age = 18; //not a lie
        Height = 179; //centimeters
        Weight = 70; //kilograms
        Eyes = "Brown";
        Teeth = "Yellow";
        Hair = "Dark Brown";

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + (Height * 0.39370)  + " centimeters tall.");
        System.out.println("He's " + (Weight * 2.2046) + " pounds heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair ");
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee");

        //This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Math.round((Height * 0.39370)) + ", and " + Math.round((Weight * 2.2046)) + " I get " + (Age + Math.round((Height * 0.39370)) + Math.round((Weight * 2.2046)) + "."));
    }
}
