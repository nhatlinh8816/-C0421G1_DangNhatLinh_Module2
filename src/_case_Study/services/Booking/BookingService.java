package _case_Study.services.Booking;

import _case_Study.models.Booking;
import _case_Study.services.Service;

import java.util.Set;

public interface BookingService extends Service {
    Set<Booking> readFile();

    @Override
    void display();

    @Override
    void add();


    @Override
    void edit();
}
