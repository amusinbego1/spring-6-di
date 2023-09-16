package guru.springframework.spring6di.service;

import guru.springframework.spring6di.config.DataConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class GreetingServiceImplEspanol implements GreetingService{
    private final DataConfig dataConfig;

    @Autowired
    public GreetingServiceImplEspanol(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }


    @Override
    public String sayHello() {
        return "Hola mi amigos";
    }

    @Override
    public String getDBName() {
        return dataConfig.getDatabase();
    }
}
