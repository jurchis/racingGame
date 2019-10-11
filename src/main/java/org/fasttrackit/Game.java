package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
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
    private List<Vehicle> competitors = new ArrayList<>();

    public void start() throws Exception {
        initializeTracks();
        displayTracks();
        initializeCompetitors();
    }

    private int getCompetitorCountFromUser() throws Exception {
        System.out.println("Please enter number of players:");
        Scanner scanner = new Scanner(System.in);

        //try catch finally or try finally, try alone does not work
        //we can replace in track throw new which is throwing new error
        //we are instead using a sout instead of throw new
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("You have entered an invalid number.");
        }
//        catch(NullPointerException e){
//            throw new NullPointerException("Sorry);
//        }
//        return 0;
        finally {
            System.out.println("Finally block is always executed;");
        }
    }

    private void initializeCompetitors() throws Exception {
        System.out.println("Today's competitors are:");
        int competitorCount = getCompetitorCountFromUser();
        for (int i = 0; i < competitorCount; i++) {
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

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Monte Carlo");
        track1.setLength(300);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Monza");
        track2.setLength(400);

        tracks[1] = track2;
    }

    private void displayTracks() {
        System.out.println("Available tracks:");
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println("Track no. " + (i + 1) + ". Name: " + tracks[i].getName() + " - Length: " + tracks[i].getLength() + " km.");
            }
        }
    }
}
