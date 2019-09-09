package org.fasttrackit;

public class Vehicle {

    private static int totalCount; //static var. specific to an entire class not only to an object

    private String name;
    private double mileage;
    private double maxSpeed;
    private String fuelType;
    private double fuelLevel;
    private double travelDistance;
    private boolean running;

    public Vehicle() {
        totalCount++;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }


//  Overloading the method. By default the value will be 1
    public double accelerate(double speed){
        return accelerate(speed, 1);
    }

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

        //incrementing or decrementing
        //fuelLevel++; we add 1 to fuelLevel value
        //fuelLevel--;

        //CTRL+ALT+L is arranging in a nice way the code
        System.out.println("Remaining fuel level is:" + fuelLevel);

        return distance;


    }
}
