package finalExamModule2.services.facility;

import finalExamModule2.models.facility.House;
import finalExamModule2.services.Service;

import java.util.Map;

public interface HouseService extends Service<House> {
    Map<House,Integer> getAllHouse();
    void updateData(String data);
    void fixData();
    void displayFixData();
}
