package guru.springframework.spring6di.keys;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class MethodLookupLockOpener implements LockOpener{
    @Override
    public void openLock() {
        getMyKeyHelper().open();
    }

    @Override
    @Lookup("keyHelper")
    public abstract KeyHelper getMyKeyHelper();
}
