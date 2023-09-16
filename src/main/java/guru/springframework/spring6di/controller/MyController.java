package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    @Autowired
    public MyController(@Qualifier("greetingServiceImplEspanol") GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("MyController created!");
    }

    public String roar(){
        System.out.println("Katy Perry");
        return "rooar";
    }

    public void sayHello(){
        System.out.println(greetingService.sayHello());
    }

}
