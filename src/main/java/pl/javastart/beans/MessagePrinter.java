package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private MessageProducer producer;

    MessagePrinter() {
    }

    public MessagePrinter(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    @Autowired
    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        System.out.println(producer.getMessage());
    }
}
