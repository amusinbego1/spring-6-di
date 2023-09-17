package guru.springframework.spring6di.keys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StandardLockOpener implements LockOpener{

    private KeyHelper keyHelper;

    @Autowired
    public void setKeyHelper(KeyHelper keyHelper) {
        this.keyHelper = keyHelper;
    }

    @Override
    public void openLock() {
        keyHelper.open();
    }

    @Override
    public KeyHelper getMyKeyHelper() {
        return keyHelper;
    }
}
