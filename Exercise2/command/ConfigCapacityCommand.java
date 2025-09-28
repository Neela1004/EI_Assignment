package command;
import office.OfficeConfig;
import office.Room;

public class ConfigCapacityCommand implements Command {
    private OfficeConfig config;
    private int roomNumber, capacity;
    public ConfigCapacityCommand(OfficeConfig config, int roomNumber, int capacity) {
        this.config = config;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }
    @Override
    public void execute() throws Exception {
        Room room = config.getRoom(roomNumber);
        room.setMaxCapacity(capacity);
        System.out.println("Room " + roomNumber + " max capacity set to " + capacity);
    }
}
