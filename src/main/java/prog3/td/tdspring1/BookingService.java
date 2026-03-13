package prog3.td.tdspring1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {
    private List<Booking> bookings = new ArrayList<>();
    public List<Booking> getAllBookings() {
        return bookings;
    }

    public List <Booking> createBooking(Booking booking) {
        for (Booking existingBooking : bookings) {
            if((existingBooking.getRoomNumber() == booking.getRoomNumber()) &&
            existingBooking.getReservationDate().equals(booking.getReservationDate())){
    throw new RuntimeException("chambre est deja prise pour cette date");
            }
        }
        bookings.add(booking);
        return bookings;
    }

}
