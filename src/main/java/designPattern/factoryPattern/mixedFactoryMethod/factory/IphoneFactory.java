package designPattern.factoryPattern.mixedFactoryMethod.factory;

import designPattern.factoryPattern.mixedFactoryMethod.pojo.Iphone;
import designPattern.factoryPattern.mixedFactoryMethod.pojo.Phone;

public class IphoneFactory implements AbstractFactory {
    public Phone makePhone() {
        return new Iphone();
    }
}
