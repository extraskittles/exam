package designPattern.factoryPattern.abstractFactory.factory;

import designPattern.factoryPattern.abstractFactory.pojo.Iphone;
import designPattern.factoryPattern.abstractFactory.pojo.Iwatch;
import designPattern.factoryPattern.abstractFactory.pojo.Phone;
import designPattern.factoryPattern.abstractFactory.pojo.Watch;

public class AppleFactory implements AbstractFactory{
    public Phone makePhone() {
        return new Iphone();
    }

    public Watch makeWatch() {
        return new Iwatch();
    }
}
