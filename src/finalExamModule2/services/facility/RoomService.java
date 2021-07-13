package finalExamModule2.services.facility;

import finalExamModule2.models.facility.Room;
import finalExamModule2.services.Service;

import java.util.Map;

public interface RoomService extends Service<Room> {
    Map<Room,Integer> getAllRoom();
    void updateData(String data);
    void fixData();
    void displayFixData();
}
