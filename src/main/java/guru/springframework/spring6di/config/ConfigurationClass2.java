package guru.springframework.spring6di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ConfigurationClass2 {
    @Bean
    public String string2(){
        return "String from " + getClass().getSimpleName();
    }

    @Bean
    public List<LocalDate> listOfDates(){
        return List.of(LocalDate.now(), LocalDate.of(2001, Month.FEBRUARY, 6));
    }

    @Bean
    public LocalDate justOneDate(){
        return LocalDate.now();
    }
}
