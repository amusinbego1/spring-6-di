package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        System.out.println("In the main method!");
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);
        System.out.println("Just before the \"getBean\"");
        MyController myController = ctx.getBean(MyController.class);
        System.out.println(myController.roar());
    }

}
