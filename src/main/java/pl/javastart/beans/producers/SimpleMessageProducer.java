package pl.javastart.beans.producers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SimpleMessageProducer implements MessageProducer {
    @Override
    public String getMessage() {
        return "Simple Message: " + System.currentTimeMillis();
    }
}