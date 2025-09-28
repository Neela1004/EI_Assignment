package behavioral.observer;

// Interface for any subscriber to NewsAgency
public interface NewsSubscriber {
    void update(String news);
    String getSubscriberName();
}
