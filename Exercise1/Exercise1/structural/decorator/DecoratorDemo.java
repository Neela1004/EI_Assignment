package structural.decorator;

public class DecoratorDemo {
    public static void run() {
        System.out.println("\n--- Decorator Pattern Demo ---");

        Message msg = new TextMessage("Hello Neela!");
        System.out.println("Original: " + msg.getContent());

        msg = new EncryptedMessage(msg);
        System.out.println("Encrypted: " + msg.getContent());

        msg = new TimestampedMessage(msg);
        System.out.println("Encrypted + Timestamped: " + msg.getContent());
    }
}
