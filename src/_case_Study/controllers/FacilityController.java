package _case_Study.controllers;

import _case_Study.services.FacilityServiceImplement;

import java.util.Scanner;

public class FacilityController {
    public static Scanner input = new Scanner(System.in);
    public static void facilityManagement(){
        FacilityServiceImplement facilityServiceImplement = new FacilityServiceImplement();
        int choice;
        do {
            System.out.println("----Facility Management ----");
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Return main menu");
            System.out.println("Chọn chức năng muốn sử dụng");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    facilityServiceImplement.display();
                    break;
                case 2:
                    facilityServiceImplement.add();
                    break;
                case 3:
                    facilityServiceImplement.maintenance();
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }while (choice!=4);

    }
}
