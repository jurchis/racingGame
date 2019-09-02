package org.fasttrackit;

public class Vehicle {

    String name;
    double mileage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    double travelDistance;
    boolean running;

    //below is a method
    //"public double accelerate" method signature
    //stout working only in methods
    //a method is called in method and not class
    //because we are in the vehicle class, we only write name instead of Car.name
    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelerating with " +
                speed + " km/h for " + durationInHours + "h.");

        //we declare a var for where to store the results
        double distance = speed * durationInHours;
        System.out.println("Distance: " + distance);

        //travelDistance = travelDistance + distance
        travelDistance += distance;

        double usedFuel = distance * mileage / 10;
        System.out.println("Used fuel:" + usedFuel);
        fuelLevel -= usedFuel;

        //CTRL+ALT+L is arranging in a nice way the code
        System.out.println("Remaining fuel level is:" + fuelLevel);

        return distance;
    }
}
