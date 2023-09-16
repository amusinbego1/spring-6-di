package guru.springframework.spring6di.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplEspanol implements GreetingService{
    @Override
    public String sayHello() {
        return "Hola mi amigos";
    }
}
