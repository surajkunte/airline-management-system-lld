package DTO;
import java.util.Date;

import enums.SeatClass;
import model.Location;

public class SearchReq {
    private Location from;
    private Location to;
    private Date date;
    private int passengers;
    private SeatClass seatClass;
    public String flightNumber;
}
