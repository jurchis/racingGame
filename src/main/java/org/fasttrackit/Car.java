package org.fasttrackit;

//Clasele sunt tipuri de date complexe pe cand
//Tipurile de date primitive sunt cu litere mici

//the Car class has been defined as a concept

//With extends we are using inheritance
//one class is inheriting only one class

//ALT+ENTER to create constructor matching super. Super:Parent
public class Car extends AutoVehicle {

    int doorCount;

    public Car(Engine engine) {
        super(engine);
        System.out.println("LOG: Creating a car");
    }
}
