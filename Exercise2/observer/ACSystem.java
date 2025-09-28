package observer;
import office.Room;

public class ACSystem implements Observer {
    @Override
    public void update(Room room) {
        if (room.getOccupants() > 0) {
            System.out.println("AC ON in Room " + room.getRoomNumber());
        } else {
            System.out.println("AC OFF in Room " + room.getRoomNumber());
        }
    }
}
