package org.fasttrackit;
//this is a one line comment
//with ctrl q on the functions it helps you with the function
//with green on the left side is showing what has been changed

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //click in the current line and CTRL X will remove the line
        //we create an object type Car, the class Car has already been created

        Car car = new Car();

        //Car() is the class constructor, it has been created in the memory, we don't have access to it so we'll create
        //There is stored the reference of an object and not the actual object from the memory, we use the ref as a rem
        //control. In Java I have access to the remote control, but not to the actual RAM memory
        //An object type Car Car car=new Car();
        //We define the class Car and create a variable type car with it
        //Classes are in uppercase while the vars in lowercase

        //This is our first car for which we gave values
        car.name="Dacia";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 180;
        car.fuelType = "Gasoline";
        //All the time the code should be in EN
        //How to read/ display the properties of the car

        //System.out searched using sout

        //CTRL D is duplicating my line
        System.out.println(car.name);
        System.out.println(car.travelDistance);

    }
}
