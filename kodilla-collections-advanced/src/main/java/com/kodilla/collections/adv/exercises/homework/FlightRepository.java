package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Madryt", "Oslo"));
        flights.add(new Flight("Amsterdam", "Kopenhaga"));
        flights.add(new Flight("Lizbona", "Ateny"));

        return flights;
    }
}
