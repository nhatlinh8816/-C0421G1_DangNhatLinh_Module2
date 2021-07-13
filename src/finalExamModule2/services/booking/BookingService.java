package finalExamModule2.services.booking;

import finalExamModule2.models.bookingAndContract.Booking;
import finalExamModule2.services.Service;

import java.util.Set;

public interface BookingService extends Service {
        Set<Booking> getAllBooking();
}
