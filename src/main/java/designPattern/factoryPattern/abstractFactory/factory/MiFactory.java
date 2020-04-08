package designPattern.factoryPattern.abstractFactory.factory;

import designPattern.factoryPattern.abstractFactory.pojo.MiPhone;
import designPattern.factoryPattern.abstractFactory.pojo.MiWatch;
import designPattern.factoryPattern.abstractFactory.pojo.Phone;
import designPattern.factoryPattern.abstractFactory.pojo.Watch;

public class MiFactory implements AbstractFactory {
    public Phone makePhone() {
        return new MiPhone();
    }

    public Watch makeWatch() {
        return new MiWatch();
    }
}
