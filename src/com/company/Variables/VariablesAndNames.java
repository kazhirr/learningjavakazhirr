package com.company.Variables;

public class VariablesAndNames {
    public static void main(String args[]){
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100; // assigns an integer value of 100
        space_in_a_car = 4; //it can be 4
        drivers = 30; // assigns as integer value of 30
        passengers = 90; //assigns an integer value of 90
        cars_not_driven = cars - drivers; //assigns the subtraction of drivers to cars
        cars_driven = drivers; //assigns the variable drivers
        carpool_capacity = cars_driven * space_in_a_car; //assigns the multiplication of cars_driven and space_in_a_car
        average_passengers_per_car = passengers / cars_driven; //assigns the division of passengers and cars_driven;

        System.out.println( "There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpool_capacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
    }
}
