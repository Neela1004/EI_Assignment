package behavioral.observer;

// Demo class to show Observer pattern in action
public class ObserverDemo {
    public static void run() {
        System.out.println("\n--- Observer Pattern Demo ---");

        NewsAgency agency = new NewsAgency("CampusNews");
        NewsSubscriber email1 = new EmailSubscriber("neela@example.com");
        NewsSubscriber email2 = new EmailSubscriber("student2@mail.com");

        agency.subscribe(email1);
        agency.subscribe(email2);

        agency.publish("Placement drive starting next week!");
        agency.publish("New CSE project submissions deadline announced.");

        agency.unsubscribe(email2);
        agency.publish("Final year project review schedule out.");
    }
}
