package _case_Study.services.Facility;

import _case_Study.models.Room;
import _case_Study.services.Service;

import java.util.Map;

public interface RoomService extends Service {
    Map<Room,Integer> readDataRoom();
    void updateData(String data);
    void maintenance();
    void displayMaintenance();
}
