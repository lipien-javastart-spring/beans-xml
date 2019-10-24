package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private MessageProducer producer;

    @Autowired
    public MessagePrinter(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        System.out.println(producer.getMessage());
    }
}
