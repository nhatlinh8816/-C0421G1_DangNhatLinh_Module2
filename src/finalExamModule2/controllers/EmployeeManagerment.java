package finalExamModule2.controllers;

import finalExamModule2.services.employeeService.EmployeeServiceImpl;
import finalExamModule2.utils.CheckChoice;

public class EmployeeManagerment {
    public void employeesMenu() {
        while (true) {
            System.out.println("1. Display all employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. xoa thong tin theo id ");
            System.out.println("5. Return menu");
            System.out.println("choice number ");
            int choice = new CheckChoice().choice();
            switch (choice) {
                case 1:
                    new EmployeeServiceImpl().disPlay();
                    break;
                case 2:
                    new EmployeeServiceImpl().add();
                    break;
                case 3:
                    new EmployeeServiceImpl().edit();
                    break;
                case 4:
                    new EmployeeServiceImpl().remove();
                    break;
                case 5:
                    return;
            }
        }
    }

}
