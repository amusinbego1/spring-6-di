package guru.springframework.spring6di.keys;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class StandardLockOpener implements LockOpener, InitializingBean, DisposableBean, BeanNameAware {

    private String name;
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

    public void init(){
        System.out.println("Bean initialized through custom initMethod");
    }

    private void customDestroy(){
        System.out.println("Bean destroyed through custom destroyMethod");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean initialized through InitializingBean interface");
        System.out.println("Name of the bean is " + name);
    }

    @PostConstruct
    private void postConstruct(){
        System.out.println("Bean initialized through annotations");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed through DisposableBean interface");
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
}
