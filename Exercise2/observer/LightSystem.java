package observer;
import office.Room;

public class LightSystem implements Observer {
    @Override
    public void update(Room room) {
        if (room.getOccupants() > 0) {
            System.out.println("Lights ON in Room " + room.getRoomNumber());
        } else {
            System.out.println("Lights OFF in Room " + room.getRoomNumber());
        }
    }
}
