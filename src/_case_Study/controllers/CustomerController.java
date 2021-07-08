package _case_Study.controllers;

import _case_Study.services.Customer.BookingServiceImplement;

import java.util.Scanner;

public class CustomerController {
    public static Scanner input = new Scanner(System.in);
    public static void customerManagement(){
        BookingServiceImplement customerServiceImplement = new BookingServiceImplement();
        int choice;
        do {
            System.out.println("----Customer Management----");
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            System.out.println("Chọn chức năng muốn sử dụng");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    customerServiceImplement.display();
                    break;
                case 2:
                    customerServiceImplement.add();
                    break;
                case 3:
                    customerServiceImplement.edit();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
            }
        } while (choice != 4);
    }
}
