package command;
import office.OfficeConfig;
public class CancelRoomCommand implements Command {
    private OfficeConfig config;
    private int roomNumber;
    public CancelRoomCommand(OfficeConfig config, int roomNumber) {
        this.config = config;
        this.roomNumber = roomNumber;
    }
    @Override
    public void execute() throws Exception {
        System.out.println("Booking for room " + roomNumber + " cancelled successfully.");
    }
}
