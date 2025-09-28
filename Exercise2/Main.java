import office.OfficeConfig;
import command.*;
import exception.InvalidCommandException;
import util.LoggerUtil;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = LoggerUtil.getLogger(Main.class.getName());

    public static void main(String[] args) {
        OfficeConfig config = OfficeConfig.getInstance();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        logger.info("Smart Office Facility System started. Type 'exit' to quit.");

        while (running) {
            System.out.print("\nEnter command: ");
            String input = scanner.nextLine().trim();

            try {
                Command command = parseCommand(input, config);
                if (command != null) {
                    command.execute();
                } else if (input.equalsIgnoreCase("exit")) {
                    running = false;
                    logger.info("Exiting system...");
                } else {
                    throw new InvalidCommandException("Unknown command: " + input);
                }
            } catch (Exception e) {
                logger.severe("Error: " + e.getMessage());
                System.out.println("⚠ " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static Command parseCommand(String input, OfficeConfig config) {
        String[] parts = input.split(" ");
        try {
            if (parts[0].equalsIgnoreCase("Config") && parts[1].equalsIgnoreCase("room") && parts[2].equalsIgnoreCase("count")) {
                return new ConfigRoomCommand(config, Integer.parseInt(parts[3]));
            } else if (parts[0].equalsIgnoreCase("Config") && parts[1].equalsIgnoreCase("room") && parts[2].equalsIgnoreCase("max") && parts[3].equalsIgnoreCase("capacity")) {
                return new ConfigCapacityCommand(config, Integer.parseInt(parts[4]), Integer.parseInt(parts[5]));
            } else if (parts[0].equalsIgnoreCase("Block") && parts[1].equalsIgnoreCase("room")) {
                return new BookRoomCommand(config, Integer.parseInt(parts[2]), parts[3], Integer.parseInt(parts[4]));
            } else if (parts[0].equalsIgnoreCase("Cancel") && parts[1].equalsIgnoreCase("room")) {
                return new CancelRoomCommand(config, Integer.parseInt(parts[2]));
            } else if (parts[0].equalsIgnoreCase("Add") && parts[1].equalsIgnoreCase("occupant")) {
                return new AddOccupantCommand(config, Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
            }
        } catch (Exception e) {
            throw new InvalidCommandException("Invalid command format.");
        }
        return null;
    }
}
