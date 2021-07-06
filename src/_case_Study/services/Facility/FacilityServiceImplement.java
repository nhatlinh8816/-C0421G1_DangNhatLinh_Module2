package _case_Study.services.Facility;

import _case_Study.Exception.Choice;
import _case_Study.models.Facility;
import _case_Study.services.Facility.FacilityService;
import _case_Study.utils.ReadAndWriteFile;

import java.util.*;

public class FacilityServiceImplement implements FacilityService {
    public static Scanner input = new Scanner(System.in);
    private static String inputOutput(String message) {
        System.out.println(message);
        String output = input.nextLine();
        return output;
    }

    public static Map<String, Integer> facility = new LinkedHashMap<>();


    public void display() {
        Set<Map.Entry<String, Integer>> setHashMap = facility.entrySet();
        System.out.println(setHashMap);
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
                    System.exit(4);
                default:break;
            }
        }
    }


    @Override
    public void edit() {

    }

    public void maintenance() {
            for (Map.Entry<String, Integer>element: facility.entrySet()){
                if (element.getValue()>=5){
                    System.out.println(element.getKey().toString());
            }
        }
    }
}
