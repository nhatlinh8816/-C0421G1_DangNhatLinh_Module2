package _case_Study.services.Facility;

import _case_Study.Check.CheckInputService;
import _case_Study.Exception.Choice;
import _case_Study.models.House;
import _case_Study.models.Room;
import _case_Study.utils.ReadAndWriteFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RoomServiceImplement implements RoomService {
    public static Scanner input = new Scanner(System.in);
    private static final String ROOM_FILE_PATH = "src\\_case_Study\\data\\room.csv";
    private static Map<Room,Integer> roomIntegerMap =new LinkedHashMap<>();
    @Override
    public Map<Room, Integer> readDataRoom() {
        roomIntegerMap = new ReadAndWriteFile<Room>().readMapData(ROOM_FILE_PATH);
        return roomIntegerMap;
    }

    @Override
    public List readData() {
        return null;
    }


    @Override
    public void add() {
        boolean checkName = false;
        String name = null;
        while (!checkName ){
            System.out.println("Nhập tên dịch vụ theo định dạng SVRO-YYYY, với YYYY là các số từ 0-9");
            name = input.nextLine();
            if (!roomIntegerMap.isEmpty()){
                for (Room room: roomIntegerMap.keySet()){
                    if (!room.getName().equals(name)){
                        checkName= new CheckInputService().checkRoom(name);
                        break;
                    }
                }
            }else {
                checkName= new CheckInputService().checkRoom(name);
            }
            if (!checkName){
                System.out.println("Mã dịch vụ sai định dạng hoặc đã bị trùng với mã trước đó");
            }
        }

        boolean checkArea = false;
        float area = 0;
        while (!checkArea){
            System.out.println("Nhập diện tích sử dụng");
            area = Integer.parseInt(input.nextLine());
            if (area<=30){
                System.out.println("Diện tích phải lớn hơn 30 m2");
                checkArea = false;
            }else {
                checkArea = true;
            }
        }

        boolean checkCost = false;
        int cost= 0;
        while (!checkCost){
            System.out.println("Nhập chi phí thuê phòng");
            cost = Integer.parseInt(input.nextLine());
            if (cost<=0){
                System.out.println("Chi phí thuê phòng phải lớn hơn 0");
                checkCost = false;
            }else {
                checkCost = true;
            }
        }

        boolean checkMaximumPeople = false;
        int maximumPeople = 0;
        while (!checkMaximumPeople){
            System.out.println("Nhập số người thuê phòng");
            maximumPeople = Integer.parseInt(input.nextLine());
            if (maximumPeople<=0||maximumPeople>20){
                System.out.println("số người thuê phòng phải nằm trong khoảng 1 đến 20 người");
                checkMaximumPeople = false;
            }else {
                checkMaximumPeople = true;
            }
        }

        String typeOfRent = null;
        boolean checkOfRent = false;
        while (!checkOfRent){
            System.out.println("Nhập kiểu thuê theo định dạng XXX-YYYY, với YYYY là các số từ 0-9");
            typeOfRent = input.nextLine();
            checkOfRent = new CheckInputService().checkTypeOfRent(typeOfRent);
            if (!checkOfRent){
                System.out.println("Kiểu thuê không đúng định dạng");
            }
        }

        String freeSevice = input.nextLine();


        Room newRoom = new Room(name,area,cost,maximumPeople,typeOfRent,freeSevice);
        roomIntegerMap.put(newRoom,0);
        new ReadAndWriteFile<Room>().writeMapData(ROOM_FILE_PATH,roomIntegerMap);
    }



    @Override
    public void edit() {
        new RoomServiceImplement().readData();
        boolean check = false;
        String editName = null;
        while (!check) {
            System.out.println(" Nhập mã dịch vụ muốn sửa ");
            editName = input.nextLine();
            check = new CheckInputService().checkRoom(editName);
        }
        for (Room room : roomIntegerMap.keySet()) {
            if (room.getName().equals(editName)) {
                boolean checkEdit = true;
                float newArea = room.getArea();
                float newCost = room.getCost();
                int newMaxNumsPeople = room.getMaximumPeople();
                String newTypeOfRent = room.getRentalType();
                String newFreeService = room.getFreeService();
                while (checkEdit) {
                    System.out.println("Nhập thuộc tính muốn thay đổi");
                    System.out.println("1. Diện tích");
                    System.out.println("2. Chi phí thuê");
                    System.out.println("3. Số người thuê");
                    System.out.println("4. Kiểu thuê ");
                    System.out.println("5. Dịch vụ miễn phí ");
                    System.out.println("6. Kết thúc");
                    Integer choice = new Choice().choiceInteger();
                    switch (choice) {
                        case 1: {
                            boolean checkArea = true;
                            while (checkArea) {
                                System.out.println("Nhập diện tích mới");
                                newArea = new Choice().choiceFloat();
                                if (newArea >= 30) {
                                    checkArea = false;
                                }
                            }
                            break;
                        }
                        case 2: {
                            boolean checkCost = true;
                            while (checkCost) {
                                System.out.println(" Nhập chi phí thuê mới");
                                newCost = new Choice().choiceFloat();
                                if (newCost > 0) {
                                    checkCost = false;
                                }
                            }
                            break;
                        }
                        case 3: {
                            boolean checkNumberPeople = true;
                            while (checkNumberPeople) {
                                System.out.println(" Nhập số người thuê mới");
                                newMaxNumsPeople = new Choice().choiceInteger();
                                if (newMaxNumsPeople <= 20 && newMaxNumsPeople > 0) {
                                    checkNumberPeople = false;
                                }
                            }
                            break;
                        }
                        case 4: {
                            boolean checkTypeOfRent = false;
                            while (!checkTypeOfRent) {
                                System.out.println(" Nhập kiểu thuê mới");
                                newTypeOfRent = input.nextLine();
                                checkTypeOfRent = new CheckInputService().checkTypeOfRent(newTypeOfRent);
                            }
                            break;
                        }

                        case 5: {
                                System.out.println("Nhập dịch vụ miễn phí mới");
                                newFreeService = input.nextLine();
                        }

                        case 6:
                            Room editRoom = new Room(editName, newArea, newCost, newMaxNumsPeople, newTypeOfRent, newFreeService);
                            int value = roomIntegerMap.get(room);
                            roomIntegerMap.remove(room);
                            roomIntegerMap.put(editRoom, value);
                            new FacilityServiceImplement().edit();
                            break;
                    }
                }
            }
        }
        new ReadAndWriteFile<>().clearFile(ROOM_FILE_PATH);
        new ReadAndWriteFile<Room>().writeMapData(ROOM_FILE_PATH,roomIntegerMap);
    }

    @Override
    public void display() {
        for (Map.Entry<Room,Integer>entry: roomIntegerMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }


    @Override
    public void updateData(String data) {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public void displayMaintenance() {

    }
}
