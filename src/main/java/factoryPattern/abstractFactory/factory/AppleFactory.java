package factoryPattern.abstractFactory.factory;

import factoryPattern.abstractFactory.pojo.Iphone;
import factoryPattern.abstractFactory.pojo.Iwatch;
import factoryPattern.abstractFactory.pojo.Phone;
import factoryPattern.abstractFactory.pojo.Watch;

public class AppleFactory implements AbstractFactory{
    public Phone makePhone() {
        return new Iphone();
    }

    public Watch makeWatch() {
        return new Iwatch();
    }
}
