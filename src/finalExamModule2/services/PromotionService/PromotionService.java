package finalExamModule2.services.PromotionService;

import finalExamModule2.models.bookingAndContract.Booking;

import java.util.Set;

public interface PromotionService {
    Set<Booking> getAllBooking();
    void displayPlayByYear();
    void voucher();
}
