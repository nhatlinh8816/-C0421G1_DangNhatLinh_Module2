package finalExamModule2.controllers;

import finalExamModule2.services.booking.BookingServiceImpl;
import finalExamModule2.services.booking.ContactServiceImpl;
import finalExamModule2.utils.CheckChoice;

public class BookingManagerment {
    public void bookingMenu() {
        while (true) {
            System.out.println("1. Add new booking");
            System.out.println("2. edit booking");
            System.out.println("3. Display list booking waitting constracts");
            System.out.println("4. Create new constracts");
            System.out.println("5. Display list contracts");
            System.out.println("6. Edit contracts");
            System.out.println("7. Return main menu");
            int choice = new CheckChoice().choice();
            switch (choice) {
                case 1:
                    new BookingServiceImpl().add();
                    break;
                case 2:
                    new BookingServiceImpl().edit();
//                    code here
                    break;
                case 3:
                    new BookingServiceImpl().getAllBooking();
                    new BookingServiceImpl().disPlay();
//                    code here
                    break;
                case 4:
                    new ContactServiceImpl().add();
//                    code here
                    break;
                case 5:
                    new ContactServiceImpl().disPlay();
//                    code here
                    break;
                case 6:
                    new ContactServiceImpl().edit();
//                    code here
                    break;
                case 7:
                    return;
                default:
                    break;
            }
        }
    }
}
