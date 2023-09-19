package guru.springframework.spring6di.keys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeyConfiguration {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    LockOpener standardLockOpener(){
        return new StandardLockOpener();
    }
}
