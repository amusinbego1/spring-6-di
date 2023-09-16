package guru.springframework.spring6di.service;

import guru.springframework.spring6di.config.DataConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class GreetingServiceImpl implements GreetingService {
    private final DataConfig dataConfig;

    @Autowired
    public GreetingServiceImpl(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    @Override
    public String sayHello() {
        return "Hallo meine liebe Freunde";
    }

    @Override
    public String getDBName() {
        return dataConfig.getDatabase();
    }
}
