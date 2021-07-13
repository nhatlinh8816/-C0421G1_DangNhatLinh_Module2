package finalExamModule2.controllers;

import finalExamModule2.services.facility.FacilityServiceImpl;
import finalExamModule2.utils.CheckChoice;

public class FacilityManagerment {
    public void facilityMenu() {
        while (true) {
            System.out.println("1. Display list facility");
            System.out.println("2. edit list facility");
            System.out.println("3. Add new facility");
            System.out.println("4. Return menu");
            int choice = new CheckChoice().choice();
            switch (choice) {
                case 1:
                    new FacilityServiceImpl().disPlay();
//                    code here
                    break;
                case 2:
                    new FacilityServiceImpl().edit();
//                    code here
                    break;
                case 3:
//                    code here
                    new FacilityServiceImpl().add();
                    break;
                case 4:
                    return;
            }
        }
    }
}
