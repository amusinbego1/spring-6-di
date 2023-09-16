package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    @Value("${spring.profiles.active}")
    private String activeProfiles;

    @Autowired
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("MyController created!");
    }

    public String roar(){
        System.out.println("Katy Perry");
        return "rooar";
    }

    public void sayHello(){
        System.out.println("Active profiles: " + activeProfiles);
        System.out.println(greetingService.sayHello());
        System.out.println("_".repeat(30));
        System.out.println(greetingService.getDBName());
    }

}
