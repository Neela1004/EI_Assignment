package office;

import observer.Subject;
import observer.OccupancySensor;

import java.util.ArrayList;
import java.util.List;

public class OfficeConfig {
    private static OfficeConfig instance;
    private List<Room> rooms;

    private OfficeConfig() {
        rooms = new ArrayList<>();
    }

    public static OfficeConfig getInstance() {
        if (instance == null) {
            instance = new OfficeConfig();
        }
        return instance;
    }

    public void configureRooms(int count) {
        rooms.clear();
        for (int i = 1; i <= count; i++) {
            Room room = new Room(i);
            rooms.add(room);
        }
        System.out.println("Office configured with " + count + " rooms.");
    }

    public Room getRoom(int roomNumber) throws Exception {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) return room;
        }
        throw new Exception("Room " + roomNumber + " does not exist.");
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
