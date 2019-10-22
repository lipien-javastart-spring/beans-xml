package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class MessagePrinter {

    @Inject
    private MessageProducer producer;

    MessagePrinter() {
    }

    public MessagePrinter(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        System.out.println(producer.getMessage());
    }
}
