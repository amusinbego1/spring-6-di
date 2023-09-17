package guru.springframework.spring6di.keys;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class KeyHelper {
    public void open(){}
}
