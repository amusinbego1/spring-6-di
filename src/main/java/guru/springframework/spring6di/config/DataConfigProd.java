package guru.springframework.spring6di.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class DataConfigProd implements DataConfig {
    @Value("${data.config.name}")
    private String dbName;
    @Override
    public String getDatabase() {
        return dbName;
    }
}
