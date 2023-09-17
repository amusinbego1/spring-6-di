package guru.springframework.spring6di;

import guru.springframework.spring6di.beans.InjectedBean;
import guru.springframework.spring6di.keys.KeyHelper;
import guru.springframework.spring6di.keys.LockOpener;
import guru.springframework.spring6di.keys.MethodLookupLockOpener;
import guru.springframework.spring6di.keys.StandardLockOpener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);
        LockOpener lockOpener = ctx.getBean("standardLockOpener", StandardLockOpener.class);

        //StandardLockOpener
        KeyHelper firstHelperFromStandard = lockOpener.getMyKeyHelper();
        Instant start = Instant.now();
        for(int i=0; i<100_000; i++)
            lockOpener.getMyKeyHelper();
        KeyHelper lastHelperFromStandard = lockOpener.getMyKeyHelper();
        Instant last = Instant.now();
        System.out.println(firstHelperFromStandard == lastHelperFromStandard);
        System.out.println(ChronoUnit.MILLIS.between(start, last));

        //LookupMethodLockOpener
        LockOpener lookupLockOpener = ctx.getBean("methodLookupLockOpener", MethodLookupLockOpener.class);
        KeyHelper firstHelperFromLookup = lookupLockOpener.getMyKeyHelper();
        Instant start1 = Instant.now();
        for(int i=0; i<100_000; i++)
            lookupLockOpener.getMyKeyHelper();
        KeyHelper lastHelperFromLookup = lookupLockOpener.getMyKeyHelper();
        Instant last1 = Instant.now();
        System.out.println(firstHelperFromLookup == lastHelperFromLookup);
        System.out.println(ChronoUnit.MILLIS.between(start1, last1));
    }

}
