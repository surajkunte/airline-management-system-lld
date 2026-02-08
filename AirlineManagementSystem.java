import service.BookingManager;
import service.FlightManager;
import service.SearchService;

public class AirlineManagementSystem {
    private FlightManager flightManager;
    private BookingManager bookingManager;
    private SearchService searchService;

    public AirlineManagementSystem(){
        flightManager = new FlightManager();
        bookingManager = new BookingManager();
        searchService = new SearchService();
    }
}
