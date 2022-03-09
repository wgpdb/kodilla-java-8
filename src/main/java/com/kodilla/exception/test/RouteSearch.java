package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> destinations = new HashMap<>();
        destinations.put("WAW", true);
        destinations.put("KRK", false);
        destinations.put("GDN", false);
        destinations.put("FRA", true);
        destinations.put("LHR", true);
        destinations.put("CDG", true);

        if (!destinations.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException(flight.getArrivalAirport());
        } else if (destinations.get(flight.getArrivalAirport())) {
            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() +
                    " is available");
        } else if (!destinations.get(flight.getArrivalAirport())) {
            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() +
                    " is NOT available");
        }
    }
}