package com.company.IfStatements;

public class ElseAndIf {
    public static void main(String[] args) {
        int people = 30, cars = 40, buses = 15;
        //the if statement is checking if one is greater or minor than
        // the other variable, if it doesn't meet any of the
        // conditions it will execute the code in the else statement
        if (cars > people)
            System.out.println("We should take the cars.");
        if (cars < people) //it this else is removed it prints the
            // string below else
            System.out.println("We should not take the cars.");
        else
            System.out.println("We can't decide.");

        if(buses > cars)
            System.out.println("That's too many buses.");
        else if (buses < cars)
            System.out.println("Maybe we could take the buses.");
        else
            System.out.println("We still can't decide.");

        if (people > buses)
            System.out.println("All right, let's just take the buses.");
        else
            System.out.println("Fine, let's stay home then.");

    }
}