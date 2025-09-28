package command;
import office.OfficeConfig;
import office.Room;

public class AddOccupantCommand implements Command {
    private OfficeConfig config;
    private int roomNumber, occupants;
    public AddOccupantCommand(OfficeConfig config, int roomNumber, int occupants) {
        this.config = config;
        this.roomNumber = roomNumber;
        this.occupants = occupants;
    }
    @Override
    public void execute() throws Exception {
        Room room = config.getRoom(roomNumber);
        room.setOccupants(occupants);
        System.out.println("Room " + roomNumber + " now has " + occupants + " occupants.");
    }
}
