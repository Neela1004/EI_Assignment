package command;
import office.OfficeConfig;
public class ConfigRoomCommand implements Command {
    private OfficeConfig config;
    private int count;
    public ConfigRoomCommand(OfficeConfig config, int count) {
        this.config = config;
        this.count = count;
    }
    @Override
    public void execute() {
        config.configureRooms(count);
    }
}
