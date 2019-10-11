package org.fasttrackit;

public class HybridCar extends Vehicle {

    //CTRL O gives posibility to select a method that can be overriden

    //method overriding just in the context of inheritance

    //q. exceptions where the overriding methods should not have same type as the original method
    //method clone has return type object but we return a subtype of object
    //co-variant return type

    //if name cheater

    //co-variant return type!!!!!!!!!!!!!!!
    @Override
    protected HybridCar clone() throws CloneNotSupportedException {
        return new HybridCar();
    }

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating with " + speed + " for " + durationInHours + " h.");
        double actualSpeed = 2 * speed;
        double distance = actualSpeed * durationInHours;
        System.out.println("Distance: " + distance);
        setTravelDistance(getTravelDistance() + distance);

        //setTravelDistance(getTravelDistance());

        System.out.println("Cheater!!!");
        return distance;
    }

    public void fly() {
        System.out.println("Flying!!!");
    }

}


