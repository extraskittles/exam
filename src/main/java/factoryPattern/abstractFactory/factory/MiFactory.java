package factoryPattern.abstractFactory.factory;

import factoryPattern.abstractFactory.pojo.MiPhone;
import factoryPattern.abstractFactory.pojo.MiWatch;
import factoryPattern.abstractFactory.pojo.Phone;
import factoryPattern.abstractFactory.pojo.Watch;

public class MiFactory implements AbstractFactory {
    public Phone makePhone() {
        return new MiPhone();
    }

    public Watch makeWatch() {
        return new MiWatch();
    }
}
