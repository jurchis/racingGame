package org.fasttrackit;

public class AutoVehicle extends  Vehicle{

    //we constrain the class to have an engine by adding a constrained the AutoVehicles to be created all the time with
    //A constructor
    //has-a relationship
    Engine engine;

    //ALT+INSERT to generate a CONSTRUCTOR
    public AutoVehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Engine Constructor Invoked");
        System.out.println("\n");
    }
}
