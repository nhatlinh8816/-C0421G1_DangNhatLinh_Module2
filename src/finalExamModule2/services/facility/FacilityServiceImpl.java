package finalExamModule2.services.facility;

import finalExamModule2.utils.CheckChoice;
import finalExamModule2.models.facility.Facility;

import java.util.List;

public class FacilityServiceImpl implements FacilityService {

    @Override
    public List<Facility> readDataFromFile() {
        return null;
    }

    @Override
    public void add() {
        boolean check = true;
        while (check) {
            System.out.println("" +
                    "1.\t Add New Villa \n " +
                    "2.\t Add New House \n" +
                    "3.\t Add New Room \n" +
                    "4.\t Back to menu \n");
            System.out.println("nhap lua chon ban muon them vao ");
            int choice = new CheckChoice().choice();
            switch (choice){
                case 1:new VillaServiceImpl().add();break;
                case 2:new HouseServiceImpl().add();break;
                case 3:new RoomServiceImpl().add();break;
                case 4:check=false;
                default:break;
            }
        }
    }

    @Override
    public void edit() {
        boolean check = true;
        while (check) {
            System.out.println("" +
                    "1.\t Add New Villa \n " +
                    "2.\t Add New House \n" +
                    "3.\t Add New Room \n" +
                    "4.\t Back to menu \n");
            System.out.println("nhap lua chon ban muon them vao ");
            int choice = new CheckChoice().choice();
            switch (choice) {
                case 1:new VillaServiceImpl().edit();break;
                case 2:new HouseServiceImpl().edit();break;
                case 3:new RoomServiceImpl().edit();break;
                case 4:check= false;
                default:break;
            }
        }
    }

    @Override
    public void disPlay() {
        new VillaServiceImpl().disPlay();
        new HouseServiceImpl().disPlay();
        new RoomServiceImpl().disPlay();
    }

    @Override
    public void displayFixData() {
        new VillaServiceImpl().displayFixData();
        new HouseServiceImpl().displayFixData();
        new RoomServiceImpl().displayFixData();
    }
}
