package org.fasttrackit;
//this is a one line comment
//with ctrl q on the functions it helps you with the function
//with green on the left side is showing what has been changed

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //click in the current line and CTRL X will remove the line
        //we create an object type Car, the class Car has already been created

        Engine engine = new Engine();
        engine.manufacturer="Renault";
        engine.capacity=2000;

        Car car = new Car(engine);

        //Car() is the class constructor, it has been created in the memory, we don't have access to it so we'll create
        //There is stored the reference of an object and not the actual object from the memory, we use the ref as a rem
        //control. In Java I have access to the remote control, but not to the actual RAM memory
        //An object type Car Car car=new Car();
        //We define the class Car and create a variable type car with it
        //Classes are in uppercase while the vars in lowercase

        //This is our first car for which we gave values
        car.setName("Dacia");
        car.setFuelLevel(60);
        car.setMileage(8.5);
        car.doorCount = 5;
        car.setFuelType("Gasoline");

        System.out.println("Car object: "+car.toString());

        //All the time the code should be in EN
        //How to read/ display the properties of the car

        //System.out searched using sout

        //CTRL D is duplicating my line
        System.out.println(car.getName());
        System.out.println(car.getTravelDistance());

        //we are accelerating with the car. We'll call the object and give him the activity/method
        //we start from the object and give it a method
        car.accelerate(60, 1);
        Engine engine2 = new Engine();
        engine2.manufacturer="VW";
        engine2.capacity=1600;

        //by creating a CONSTRUCTOR we are forced to create a car only with an engine
        Car car2 = new Car(engine2);
        car2.setName("Golf");

        car2.setFuelLevel(60);
        car2.setMileage(8.5);
        car2.doorCount = 4;
        car2.setFuelType("Diesel");

        System.out.println("Car name 2 is: " + car2.getName());

//        //% is modulo and not percentage
//        System.out.println("Modulo examples");
//        System.out.println(4%2);
//        System.out.println(4%3);

        System.out.println("Please enter some text:");
        Scanner scannerX = new Scanner(System.in);
        String text = scannerX.nextLine(); //reading a row written by the user
        System.out.println("Input from user: " + text);

//        System.out.println("Static variable example:");

/*        car.totalCount = 1;
        System.out.println("Total count in car: " + car.totalCount);

        car2.totalCount = 12; //we should only call static vars eg.: from the class itself Car
        //not from the variable containing an object of that class
        System.out.println("Total count in car after setting car2: " + car.totalCount);
        System.out.println("Total count in car2: " +car2.totalCount);
        System.out.println("Total count in Car class: " +Car.totalCount);*/

        car.accelerate(90,1);

        Vehicle hCar = new HybridCar();
        //method is being used from the object type and not the reference
        //so is the method from HybridCar and not Vehicle
        //even if the variable is of type Vehicle
        hCar.setName("Cheater");
        hCar.setFuelLevel(100);
        hCar.accelerate(90, 1);

        //Variable type is deciding the methods that we are able to use
        //if fly() is in the object but not in the Vehicle then we cannot call it
        //the Object decides the methods
        //hCar.fly();
        //we solve it with TYPE CASTING
        ((HybridCar) hCar).fly();
    }
}
