package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    //array. fixed length as initialized
    private Track[] tracks = new Track[3];
    //list. the size can be modified
    //list is an interface that extends collections
    //collections is an interface that extends a lot if other
    //set is another type of collections
    //Set vs list, in set the elements are only unique
    //Map does not extends collection but is like a Dictionary in Python
    //Map has pairs of string and integers
    //Map<String, Integer> map  = new HashMap<>();
    private List<Vehicle> competitors= new ArrayList<>();

    public void start(){
        initializeTracks();
        displayTracks();
        initializeCompetitors();
    }

    private void initializeCompetitors(){
        System.out.println("Today's competitors are:");
        int competitorCount = 2;
        for (int i = 0; i<competitorCount; i++){
            Vehicle competitor = new Vehicle();
            competitor.setName("Competitor " + i);
            competitor.setMaxSpeed(300);
            competitor.setMileage(ThreadLocalRandom.current().nextDouble(6, 12));
            competitor.setFuelLevel(80);
            System.out.println(competitor);
            competitors.add(competitor);
            //len is for arrays and size is for lists, len is a property and size is a method
            competitors.size();
        }
    }

    private void initializeTracks(){
        Track track1 = new Track();
        track1.setName("Monte Carlo");
        track1.setLength(300);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Monza");
        track2.setLength(400);

        tracks[1] = track2;
    }

    private void displayTracks(){
        System.out.println("Available tracks:");
        for (int i = 0; i < tracks.length; i++){
            if (tracks[i] != null){
                System.out.println("Track no. "+(i+1)+". Name: "+tracks[i].getName() +" - Length: "+ tracks[i].getLength() + " km.");
            }
        }
    }
}
