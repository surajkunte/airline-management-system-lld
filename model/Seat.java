import enums.SeatClass;

package model;
public class Seat {
    String seatId;
    SeatClass seatClass;

    public Seat(String seatId, SeatClass seatClass){
        this.seatId = seatId;
        this.seatClass = seatClass;
    }

    public String getSeatId(){
        return seatId;
    }

    public String SeatClass(){
        return seatClass;
    }
}
