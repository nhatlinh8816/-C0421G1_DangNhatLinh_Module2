package _case_Study.services.Facility;

import _case_Study.Exception.Choice;
import _case_Study.controllers.FacilityController;


import java.util.*;

public class FacilityServiceImplement implements FacilityService {
    public static Scanner input = new Scanner(System.in);
    public static Map<String, Integer> facility = new LinkedHashMap<>();

    public void display() {
        int choice = 0;
        while (choice!=4) {
            System.out.println("1.Display Villa");
            System.out.println("2.Display House");
            System.out.println("3.Display Room");
            System.out.println("4.Exit");
            choice = new Choice().choiceInteger();
            switch (choice){
                case 1:
                    new VillaServiceImplement().display();
                    break;
                case 2:
                    new HouseServiceImplement().display();
                    break;
                case 3:
                    new RoomServiceImplement().display();
                    break;
                case 4:
                    FacilityController.facilityManagement();
                default:break;
            }
        }
    }

    @Override
    public List readData() {
        return null;
    }

    @Override
    public void add() {
        int choice = 0;
        while (choice!=4) {
            System.out.println("1.Add New Villa");
            System.out.println("2.Add New House");
            System.out.println("3.Add New Room");
            System.out.println("4.Exit");
            choice = new Choice().choiceInteger();
            switch (choice){
                case 1:
                    new VillaServiceImplement().add();
                    break;
                case 2:
                    new HouseServiceImplement().add();
                    break;
                case 3:
                    new RoomServiceImplement().add();
                    break;
                case 4:
                    FacilityController.facilityManagement();
                default:break;
            }
        }
    }


    @Override
    public void edit() {
        int choice = 0;
        while (choice!=4) {
            System.out.println("1.Edit Villa");
            System.out.println("2.Edit House");
            System.out.println("3.Edit Room");
            System.out.println("4.Exit");
            choice = new Choice().choiceInteger();
            switch (choice){
                case 1:
                    new VillaServiceImplement().edit();
                    break;
                case 2:
                    new HouseServiceImplement().edit();
                    break;
                case 3:
                    new RoomServiceImplement().edit();
                    break;
                case 4:
                    FacilityController.facilityManagement();
                default:break;
            }
        }
    }

    public void maintenance() {
            for (Map.Entry<String, Integer>element: facility.entrySet()){
                if (element.getValue()>=5){
                    System.out.println(element.getKey().toString());
            }
        }
    }
}
