package com.company.IfStatements;

public class WhatIf {
    public static void main(String[] args) {
        int people = 30, cats = 30, dogs = 15;

        if (people < cats) { //It checks for the value of both integers and writes the string if the condition is true
            System.out.println("Too many cats! The world is doomed!"); //The curly braces allow to write multiple instructions
        }
        if (people > cats) {
            System.out.println("Not many cats! The world is saved!");
        }
        if (people < dogs) {
            System.out.println("The world is drooled on!");
        }
        if (people > dogs) {
            System.out.println("The world is dry!");
        }

        dogs += 5;

        if (people >= dogs){
            System.out.println("People are greater than or equal to dogs.");
        }
        if (people <= dogs) {
            System.out.println("People are less than or equal to dogs.");
        }
        if (people == dogs){
            System.out.println("People are dogs.");
        }
    }
}
