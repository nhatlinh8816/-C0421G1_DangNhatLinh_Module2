package finalExamModule2.services.facility;

import finalExamModule2.models.facility.Villa;
import finalExamModule2.services.Service;

import java.util.Map;

public interface VillaService extends Service<Villa> {
    Map<Villa,Integer> getAllVilla();
    void updateData(String data);
    void fixData();
    void displayFixData();
}
