package app;

import beans.MessagePrinter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = MessagePrinter.class)
public class ApplicationConfig {
}
