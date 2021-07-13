package finalExamModule2.services.booking;

import finalExamModule2.models.bookingAndContract.Booking;
import finalExamModule2.services.Service;

import java.util.Queue;

public interface ContactService extends Service {

    Queue<Booking> getAllBookByQueue();
}
