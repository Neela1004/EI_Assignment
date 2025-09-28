package command;
import office.OfficeConfig;
public class BookRoomCommand implements Command {
    private OfficeConfig config;
    private int roomNumber;
    private String time;
    private int duration;
    public BookRoomCommand(OfficeConfig config, int roomNumber, String time, int duration) {
        this.config = config;
        this.roomNumber = roomNumber;
        this.time = time;
        this.duration = duration;
    }
    @Override
    public void execute() throws Exception {
        System.out.println("Room " + roomNumber + " booked at " + time + " for " + duration + " mins.");
    }
}
