package model;
public class Booking {
    private String bookingId;
    Flight flight;
    Map<Seat, Passenger>seatPassengerMap;
    private BookingStatus bookingStatus; 

    public void cancel(){
        status = BookingStatus.CANCELLED;
    }
}
