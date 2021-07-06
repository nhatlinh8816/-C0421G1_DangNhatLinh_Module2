package _case_Study.services.Facility;


import _case_Study.models.Villa;
import _case_Study.services.Service;

import java.util.Map;

public interface VillaService extends Service {
    Map<Villa,Integer> readDataVilla();
    void updateData(String data);
    void maintenance();
    void displayMaintenance();
}
