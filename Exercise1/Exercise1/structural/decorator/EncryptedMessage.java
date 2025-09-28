package structural.decorator;

// Concrete decorator for encryption
public class EncryptedMessage extends MessageDecorator {

    public EncryptedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        // simple mock encryption (reversing string)
        return new StringBuilder(message.getContent()).reverse().toString();
    }
}
