package guru.springframework.spring6di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public MyController() {
        System.out.println("MyController created!");
    }

    public String roar(){
        System.out.println("Katy Perry");
        return "rooar";
    }
}
