package finalExamModule2.controllers;

import finalExamModule2.services.PromotionService.PromotionServiceImpl;
import finalExamModule2.utils.CheckChoice;

public class PromotionManagerment {
    public  void promotionMenu() {
        while (true) {
            System.out.println("1. Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3. Return menu");
            int choice = new CheckChoice().choice();
            switch (choice) {
                case 1:
                    new PromotionServiceImpl().displayPlayByYear();
//                    code here
                    break;
                case 2:
                    new PromotionServiceImpl().voucher();
//                    code here
                    break;
                case 3:
                    return;
            }
        }
    }
}
