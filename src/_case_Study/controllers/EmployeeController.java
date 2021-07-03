package _case_Study.controllers;

import _case_Study.services.EmployeeServiceImplement;

import java.util.Scanner;

public class EmployeeController {
    public static Scanner input = new Scanner(System.in);
    public static void employeeManagement(){
        EmployeeServiceImplement employeeServiceImplement = new EmployeeServiceImplement();
        int choice;
        do {
            System.out.println("----Employee Management----");
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            System.out.println("Chọn chức năng muốn sử dụng");
            choice= Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    employeeServiceImplement.display();
                    break;
                case 2:
                    employeeServiceImplement.add();
                    break;
                case 3:
                    employeeServiceImplement.edit();
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }while (choice!=4);
    }
}
