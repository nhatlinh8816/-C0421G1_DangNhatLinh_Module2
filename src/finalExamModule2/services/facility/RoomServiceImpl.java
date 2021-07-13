package finalExamModule2.services.facility;

import finalExamModule2.DataStream.ReadAndWriteDataMap;
import finalExamModule2.models.facility.Room;
import finalExamModule2.utils.CheckValidateId;
import finalExamModule2.utils.CheckChoice;
import finalExamModule2.utils.CheckSpace;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RoomServiceImpl implements RoomService {
    private static final String filepath = "src\\caseStudy\\data\\Room.csv";
    private static final ReadAndWriteDataMap<Room> roomReadAndWrite = new ReadAndWriteDataMap<Room>();
    private static Map<Room, Integer> roomMap = new LinkedHashMap<>();

    @Override
    public Map<Room, Integer> getAllRoom() {
        roomMap = roomReadAndWrite.readDataFromFileMap(filepath);
        return roomMap;
    }

    @Override
    public void updateData(String idRoom) {
        new RoomServiceImpl().getAllRoom();
        boolean check = true;
        boolean checkId = false;
        while (check) {
            while (!checkId) {
                checkId = new CheckValidateId().checkIdNameRoom(idRoom);
            }
            for (Room i : roomMap.keySet()) {
                if (i.getUtilName().equals(idRoom) && roomMap.get(i) < 5) {
                    int num = roomMap.get(i) + 1;
                    roomMap.replace(i, num);
                    check = false;
                    break;
                }
            }
        }
        roomReadAndWrite.clearData(filepath);
        roomReadAndWrite.writeDataFromFileMap(roomMap, filepath);
    }
    public void updateDataLow(String idRoom) {
        new RoomServiceImpl().getAllRoom();
        boolean check = true;
        boolean checkId = false;
        while (check) {
            while (!checkId) {
                checkId = new CheckValidateId().checkIdNameRoom(idRoom);
            }
            for (Room i : roomMap.keySet()) {
                if (i.getUtilName().equals(idRoom) && roomMap.get(i) < 5) {
                    int num = roomMap.get(i) - 1;
                    roomMap.replace(i, num);
                    check = false;
                    break;
                }
            }
        }
        roomReadAndWrite.clearData(filepath);
        roomReadAndWrite.writeDataFromFileMap(roomMap, filepath);
    }
    @Override
    public void fixData() {
        new RoomServiceImpl().getAllRoom();
        for (Room i : roomMap.keySet()) {
            if (roomMap.get(i) == 5) {
                int num = 0;
                roomMap.replace(i, num);
                break;
            }
        }
        roomReadAndWrite.clearData(filepath);
        roomReadAndWrite.writeDataFromFileMap(roomMap, filepath);
    }


    @Override
    public void displayFixData() {
        new RoomServiceImpl().getAllRoom();
        for (Room i : roomMap.keySet()) {
            if (roomMap.get(i) == 5) {
                System.out.println(i + " " + roomMap.get(i));
            }
        }
    }

    @Override
    public List<Room> readDataFromFile() {
        return null;
    }

    @Override
    public void add() {
        new RoomServiceImpl().getAllRoom();
        boolean check = false;
        String name = null;
        while (!check) {
            System.out.println(" nhap ma dich vu: Room có dinh dang SVXX-YYYY, với YYYY là các số từ 0-9, XX là: RO vd: SVRO-0001");
            name = new CheckSpace().input().nextLine();
            if (!roomMap.isEmpty()) {
                for (Room room : roomMap.keySet()) {
                    if (!room.getUtilName().equals(name)) {
                        check = new CheckValidateId().checkIdNameRoom(name);
                        break;
                    }
                }
            } else {
                check = new CheckValidateId().checkIdNameRoom(name);
            }
            if (!check) {
                System.out.println("trung ma dich vu " + name + " vui long nhap lai ");
            }
        }
        boolean check2 = true;
        int useArea = 0;
        while (check2) {
            System.out.println(" nhap dien tich su dung >30 ");
            useArea = new CheckChoice().choice();
            if (useArea >= 30) {
                check2 = false;
            }
        }
        boolean check3 = true;
        int rentalFees = 0;
        while (check3) {
            System.out.println(" nhap ch phi the phai la so >0  ");
            rentalFees = new CheckChoice().choice();
            if (rentalFees > 0) {
                check3 = false;
            }
        }
        boolean check4 = true;
        int maxNumsPeople = 0;
        while (check4) {
            System.out.println("so nguoi toi da la 20 nguoi.");
            maxNumsPeople = new CheckChoice().choice();
            if (maxNumsPeople <= 20 && maxNumsPeople > 0) {
                check4 = false;
            }
        }
        boolean check5 = false;
        String rentalType = null;
        while (!check5) {
            System.out.println(" Kiểu thuê co dinh dang XXX-YYYY :bao gồm thuê theo năm: Yea, tháng: Mon, ngày: Day, giờ: Hou; YYYY là các số từ 0-9 vd: Day-0001");
            rentalType = new CheckSpace().input().nextLine();
            check5 = new CheckValidateId().checkDate(rentalType);
        }
        System.out.println("nhap dich vu mien phi di kem room");
        String free = new CheckSpace().input().nextLine();
        Room room2 = new Room(name, useArea, rentalFees, maxNumsPeople, rentalType, free);
        roomMap.put(room2, 0);
        roomReadAndWrite.writeDataFromFileMap(roomMap, filepath);
    }

    @Override
    public void edit() {
        new RoomServiceImpl().getAllRoom();
        boolean check = false;
        String name = null;
        while (!check) {
            System.out.println(" nhap ma dich vu: Room có dinh dang SVXX-YYYY, với YYYY là các số từ 0-9, XX là: RO vd: SVRO-0001");
            name = new CheckSpace().input().nextLine();
            check = new CheckValidateId().checkIdNameRoom(name);
        }
        for (Room roomEdit : roomMap.keySet()) {
            if (roomEdit.getUtilName().equals(name)) {
                boolean checkedit = true;
                int useArea = roomEdit.getUseArea();
                int rentalFees = roomEdit.getRentalFees();
                int maxNumsPeople = roomEdit.getMaxNumsPeople();
                String rentalType = roomEdit.getRentalType();
                String free = roomEdit.getFreeServices();
                while (checkedit) {
                    System.out.println("ban muon sua thong tin cho " + roomEdit.toString());
                    System.out.println("1. nhap dien tich su dung >30 ");
                    System.out.println("2. nhap chi phi thue la so >0  ");
                    System.out.println("3. so nguoi toi da la 20 nguoi.");
                    System.out.println("4. Kiểu thuê co dinh dang XXX-YYYY :bao gồm thuê theo năm: Yea, tháng: Mon, ngày: Day, giờ: Hou; YYYY là các số từ 0-9 vd: Day-0001");
                    System.out.println("5. dich vu mien phi di kem ");
                    System.out.println("6. Ket thuc chinh sua ");
                    System.out.println("nhap lua chon cua ban ");
                    int choice = new CheckChoice().choice();
                    switch (choice) {
                        case 1: {
                            boolean check2 = true;
                            while (check2) {
                                System.out.println(" nhap dien tich su dung >30  ");
                                useArea = new CheckChoice().choice();
                                if (useArea >= 30) {
                                    check2 = false;
                                }
                            }
                            break;
                        }
                        case 2: {
                            boolean check3 = true;

                            while (check3) {
                                System.out.println(" nhap chi phi thue la so >0  ");
                                rentalFees = new CheckChoice().choice();
                                if (rentalFees > 0) {
                                    check3 = false;
                                }
                            }
                            break;
                        }
                        case 3: {
                            boolean check4 = true;

                            while (check4) {
                                System.out.println("so nguoi toi da la 20 nguoi.");
                                maxNumsPeople = new CheckChoice().choice();
                                if (maxNumsPeople <= 20 && maxNumsPeople > 0) {
                                    check4 = false;
                                }
                            }
                            break;
                        }
                        case 4: {
                            boolean check5 = false;
                            while (!check5) {
                                System.out.println(" Kiểu thuê co dinh dang XXX-YYYY :bao gồm thuê theo năm: Yea, tháng: Mon, ngày: Day, giờ: Hou; YYYY là các số từ 0-9 vd: Day-0001");
                                rentalType = new CheckSpace().input().nextLine();
                                check5 = new CheckValidateId().checkDate(rentalType);
                            }
                            break;
                        }
                        case 5: {
                            System.out.println("nhap dich vu mien phi di kem room");
                            free = new CheckSpace().input().nextLine();
                            break;
                        }
                        case 6:
                            checkedit = false;
                        default:
                            break;
                    }
                }
                Room room1 = new Room(name, useArea, rentalFees, maxNumsPeople, rentalType, free);
                roomMap.remove(roomEdit);
                roomMap.put(room1, 0);
                break;
            }
        }
        roomReadAndWrite.clearData(filepath);
        roomReadAndWrite.writeDataFromFileMap(roomMap, filepath);
    }

    @Override
    public void disPlay() {
        new RoomServiceImpl().getAllRoom();
        Set<Room> keySet = roomMap.keySet();
        for (Room key : keySet) {
            System.out.println(key + " " + roomMap.get(key));
        }
    }

    public String checkDataBooking() {
        new RoomServiceImpl().getAllRoom();
        String id = null;
        boolean checkId = false;
        while (!checkId) {
            System.out.println("nhap idname ban muon book");
            id = new CheckSpace().input().nextLine();
            for (Room i : roomMap.keySet()) {
                if (i.getUtilName().equals(id) && roomMap.get(i) < 5) {
                    checkId = new CheckValidateId().checkIdNameRoom(id);
                }
            }
            if (!checkId) {
                System.out.println(id + "khong co trong danh sach hoac dang trong qua trinh bao trì!!!");
            }
        }
        return id;
    }
}
