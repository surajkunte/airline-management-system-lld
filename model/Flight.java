package model;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import enums.Aircraft;

public class Flight {
    String flightNumber;
    Location source;
    Location destination;
    Date departureTime;
    Date arrivalTime;
    Aircraft aircraft;

    Map<Seat, Boolean> seatAvailability = new HashMap<>();
    
    public Flight(Aircraft aircraft){
        this.aircraft = aircraft;
        for(Seat s: aircraft.getSeats){
            seatAvailability.put(seat, true);
        }
    }

    public synchronized boolean reserveSeat(Seat seat){
        if(seatAvailability.getOrDefault(seat, true)){
            seatAvailability.put(seat, false);
            return false;
        }
        return true;
    }

    public synchronized void releaseSeat(Seat seat){
        seatAvailability.put(seat, true);
    }
}
