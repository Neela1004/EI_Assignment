

import behavioral.observer.ObserverDemo;
import behavioral.strategy.StrategyDemo;
import creational.factory.FactoryDemo;
import creational.builder.BuilderDemo;
import structural.adapter.AdapterDemo;
import structural.decorator.DecoratorDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * StudentMain: Standard command-driven application for Design Patterns demos
 */
public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final Map<String, Command> commands = new HashMap<>();

    static {
        commands.put("observer", ObserverDemo::run);
        commands.put("strategy", StrategyDemo::run);
        commands.put("factory", FactoryDemo::run);
        commands.put("builder", BuilderDemo::run);
        commands.put("adapter", AdapterDemo::run);
        commands.put("decorator", DecoratorDemo::run);
    }

    public static void main(String[] args) {
        logger.info("Design Patterns Demo App started");
        System.out.println("Welcome to Design Patterns Demo App!");
        System.out.println("Type 'exit' to quit.");

        try (Scanner scanner = new Scanner(System.in)) {
            String input;
            while ((input = readInput(scanner)) != null) {
                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("Exiting simulator.");
                    logger.info("Application exited by user");
                    break;
                }

                Command command = commands.get(input.toLowerCase());
                if (command != null) {
                    try {
                        command.execute();
                    } catch (Exception e) {
                        logger.log(Level.SEVERE, "Error executing command: " + input, e);
                        System.out.println("An error occurred while executing the demo.");
                    }
                } else {
                    System.out.println("Invalid command. Try again.");
                }
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Unexpected error in main loop", e);
            System.out.println("Unexpected error occurred. Application will exit.");
        }
    }

    // Reads user input with prompt
    private static String readInput(Scanner scanner) {
        System.out.print("> ");
        String line = scanner.nextLine();
        if (line != null) {
            line = line.trim();
            if (!line.isEmpty()) return line;
        }
        return null;
    }

    // Command functional interface
    @FunctionalInterface
    interface Command {
        void execute();
    }
}
