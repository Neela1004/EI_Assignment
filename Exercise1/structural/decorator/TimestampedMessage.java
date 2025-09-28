package structural.decorator;

import java.time.LocalDateTime;

// Concrete decorator adding timestamp
public class TimestampedMessage extends MessageDecorator {

    public TimestampedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return message.getContent() + " [Sent at: " + LocalDateTime.now() + "]";
    }
}
