package _case_Study.controllers;

import _case_Study.Exception.Choice;
import _case_Study.services.Customer.BookingServiceImplement;

public class BookingController {
    public static void bookingManagement(){
        BookingServiceImplement bookingServiceImplement = new BookingServiceImplement();
        int choice;
        do {
            System.out.println("----Booking Managerment----");
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new constracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");
            System.out.println("Chọn chức năng muốn sử dụng");
            choice = new Choice().choiceInteger();
            switch (choice) {
                case 1:
                    bookingServiceImplement.display();
                    break;
                case 2:
                    bookingServiceImplement.add();
                    break;
                case 3:
                    bookingServiceImplement.edit();
                    break;
                case 6:
                    FuramaController.displayMainMenu();
                    break;
            }
        } while (choice != 6);
}

}