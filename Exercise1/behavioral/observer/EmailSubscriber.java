package behavioral.observer;

public class EmailSubscriber implements NewsSubscriber {
    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String news) {
        System.out.println("Email to " + email + ": " + news);
    }

    @Override
    public String getSubscriberName() {
        return "Email[" + email + "]";
    }
}
