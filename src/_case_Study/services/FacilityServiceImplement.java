package _case_Study.services;

import _case_Study.models.Facility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImplement implements FacilityService {
    public static Scanner input = new Scanner(System.in);
    public static final String FACILITY_FILE_PATH = "src\\_case_Study\\data\\facility.csv";

    private static String inputOutput(String message) {
        System.out.println(message);
        String output = input.nextLine();
        return output;
    }

    public static Map<String, Integer> facility = new LinkedHashMap<>();

    static {
        facility.put("Villa", 1);
        facility.put("House", 2);
        facility.put("Room", 5);
    }


    @Override
    public void display() {
        Set<Map.Entry<String, Integer>> setHashMap = facility.entrySet();
        System.out.println(setHashMap);
    }

    @Override
    public void add() {
        System.out.println("Xin mời lựa chọn");
        System.out.println("1.Add New Villa ");
        System.out.println("2.Add New House ");
        System.out.println("3.Add New Room ");
    }

    @Override
    public void creat() {

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
