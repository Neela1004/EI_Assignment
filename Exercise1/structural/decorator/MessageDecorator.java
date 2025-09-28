package structural.decorator;

// Base decorator
public abstract class MessageDecorator implements Message {
    protected final Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }
}
