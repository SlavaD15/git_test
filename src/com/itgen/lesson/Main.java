package com.itgen.lesson;

public class Main {
    public static void main(String[] args) {
        Trip[] trips = new Trip[4];
        trips[0] = new Trip(155, "Yeast Yeastovich", 105, 7);
        trips[1] = new Trip(205, "Risotto Risottovich", 155, 14);
        trips[2] = new Trip(255, "Mushroom Mushrovich", 205, 21);
        trips[3] = new Trip();
        trips[3].setSpends_transport(25);
        System.out.println(trips[0].getDays() + trips[1].getDays());
        for (Trip trip : trips) {
            trip.toStrings();
        }
    }
}
