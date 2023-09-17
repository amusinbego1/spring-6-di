package guru.springframework.spring6di.beans;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;

@Component("injectingBean")
public class InjectionBean {
    private String firstName = "Amer";
    private String lastName = "Musinbegovic";
    private Integer age = 22;
    private LocalDate born = LocalDate.of(2001, Month.FEBRUARY, 6);

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getBorn() {
        return born;
    }
}
