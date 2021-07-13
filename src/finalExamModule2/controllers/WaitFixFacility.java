package finalExamModule2.controllers;

import finalExamModule2.services.facility.HouseServiceImpl;
import finalExamModule2.services.facility.RoomServiceImpl;
import finalExamModule2.services.facility.VillaServiceImpl;
import finalExamModule2.utils.CheckChoice;

public class WaitFixFacility {
    public void waitFixxing() {
        while (true) {
            System.out.println("1. hien thi danh sach các danh mục cần sửa ");
            System.out.println("2. tiến hành sửa ");
            System.out.println("3. Return main menu ");
            System.out.println("nhap lua chon ");
            int choice = new CheckChoice().choice();
            switch (choice) {
                case 1: {
                    new HouseServiceImpl().displayFixData();
                    System.out.println("\n");
                    new RoomServiceImpl().displayFixData();
                    System.out.println("\n");
                    new VillaServiceImpl().displayFixData();
                    break;
                }
                case 2: {
                    boolean check = true;
                    while (check) {
                        System.out.println("ban muon sua danh muc nao ");
                        System.out.println("1. fix House ");
                        System.out.println("2. fix Room ");
                        System.out.println("3. fix Villa ");
                        System.out.println("4. thoat sua  ");
                        System.out.println("nhap lua chon ");
                        int choice2 = new CheckChoice().choice();
                        switch (choice2){
                            case 1:{
                                new HouseServiceImpl().displayFixData();
                                new HouseServiceImpl().fixData();
                                System.out.println("1. fix House complete ");
                                break;
                            }
                            case 2:{
                                new RoomServiceImpl().displayFixData();
                                new RoomServiceImpl().fixData();
                                System.out.println("2. fix Room complete ");
                                break;
                            }
                            case 3:{
                                new VillaServiceImpl().displayFixData();
                                new VillaServiceImpl().fixData();
                                System.out.println("3. fix Villa Complete");
                                break;
                            }
                            case 4:{
                                check=false;
                            }
                            default:break;
                        }
                    }
                }
                case 3:{
                    return;
                }
                default:break;
            }
        }
    }
}
