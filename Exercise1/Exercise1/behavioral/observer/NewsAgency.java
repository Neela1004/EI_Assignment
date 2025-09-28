package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// NewsAgency publishes news to all subscribers
public class NewsAgency {
    private final String agencyName;
    private final List<NewsSubscriber> subscribers = new ArrayList<>();

    public NewsAgency(String name) {
        this.agencyName = name;
    }

    public void subscribe(NewsSubscriber subscriber) {
        if(subscriber != null) {
            subscribers.add(subscriber);
            System.out.println(subscriber.getSubscriberName() + " subscribed to " + agencyName);
        }
    }

    public void unsubscribe(NewsSubscriber subscriber) {
        if(subscriber != null && subscribers.remove(subscriber)) {
            System.out.println(subscriber.getSubscriberName() + " unsubscribed from " + agencyName);
        }
    }

    public void publish(String news) {
        System.out.println("\n[" + agencyName + "] Publishing news: " + news);
        for (NewsSubscriber s : subscribers) {
            try {
                s.update(news);
            } catch (Exception e) {
                System.out.println("Failed to notify " + s.getSubscriberName());
            }
        }
    }
}
