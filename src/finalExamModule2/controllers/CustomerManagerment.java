package finalExamModule2.controllers;

import finalExamModule2.services.CustomerService.CustomerServiceImpl;
import finalExamModule2.utils.CheckChoice;

public class CustomerManagerment {
    public void customerMenu() {
        while (true) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. xoa customer theo id ");
            System.out.println("5. Return menu");
            int choice= new CheckChoice().choice();
            switch (choice) {
                case 1:
                    new CustomerServiceImpl().disPlay();
                    break;
                case 2:
                    new CustomerServiceImpl().add();
                    break;
                case 3:
                    new CustomerServiceImpl().edit();
                    break;
                case 4:
                    new CustomerServiceImpl().remove();
                    break;
                case 5:
                    return;
            }
        }
    }
}
