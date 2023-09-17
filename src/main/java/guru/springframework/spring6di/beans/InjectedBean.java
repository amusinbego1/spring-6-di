package guru.springframework.spring6di.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component("injectedBean")
public class InjectedBean {

    @Autowired
    private List<LocalDate> datesFromOne;


    @Value("#{configurationClass2.listOfDates()}")
    private List<LocalDate> dates;

    @Value("#{injectingBean.firstName + \" \" + injectingBean.lastName}")
    private String fullName;

    @Value("#{injectingBean.born}")
    private LocalDate born;

    @Value("${spring.profiles.active}")
    private String activeProfile;

//    @Autowired
//    public InjectedBean(List<LocalDate> dates) {
//        this.dates = dates;
//    }


    public String getDates() {
        return """
                List from single dates: %s 
                List from list of dates: %s""".formatted(datesFromOne, dates);
    }

    @Override
    public String toString() {
        return "InjectedBean{" +
                "fullName='" + fullName + '\'' +
                ", born=" + born +
                ", activeProfile='" + activeProfile + '\'' +
                '}';
    }
}
