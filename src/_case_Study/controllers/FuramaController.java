package _case_Study.controllers;

import _case_Study.services.*;

import java.util.Scanner;

public class FuramaController {
    public static Scanner input = new Scanner(System.in);

    public static void displayMainMenu() {
        EmployeeServiceImplement employeeServiceImplement = new EmployeeServiceImplement();
        CustomerServiceImplement customerServiceImplement = new CustomerServiceImplement();
        BookingServiceImplement bookingServiceImplement = new BookingServiceImplement();
        PromotionServiceImplement promotionServiceImplement = new PromotionServiceImplement();
        FacilityServiceImplement facilityServiceImplement = new FacilityServiceImplement();
        System.out.println("----Menu chương trình----");
        int choice;
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Managerment");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Chọn chức năng muốn sử dụng");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    employeeServiceImplement.showMenu();
                    break;
                case 2:
                    customerServiceImplement.showMenu();
                    break;
                case 3:
                    facilityServiceImplement.showMenu();
                    break;
                case 4:
                    bookingServiceImplement.showMenu();
                    break;
                case 5:
                    promotionServiceImplement.showMenu();
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        } while (choice != 6);
    }
}








