package app;

import beans.MessagePrinter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDiApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.print();
        ctx.close();
    }
}
