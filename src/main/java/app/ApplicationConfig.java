package app;

import beans.MessagePrinter;
import beans.MessageProducer;
import beans.SimpleMessageProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean(name="myMessagePrinter")
    public MessagePrinter getPrinter() {
        MessageProducer producer = new SimpleMessageProducer();
        return new MessagePrinter(producer);
    }
}
