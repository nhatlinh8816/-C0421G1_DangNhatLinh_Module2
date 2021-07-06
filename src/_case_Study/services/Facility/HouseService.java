package _case_Study.services.Facility;

import _case_Study.models.House;
import _case_Study.services.Service;

import java.util.List;
import java.util.Map;

public interface HouseService extends Service {
    Map<House,Integer>readDataHouse();
    void updateData(String data);
    void maintenance();
    void displayMaintenance();
}
