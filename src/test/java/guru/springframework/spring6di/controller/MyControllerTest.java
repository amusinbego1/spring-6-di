package guru.springframework.spring6di.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyControllerTest {

    private final MyController myController;

    @Autowired
    MyControllerTest(MyController myController) {
        this.myController = myController;
    }

    @Test
    void sayHello() {
        myController.sayHello();
    }
}