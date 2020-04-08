package designPattern.factoryPattern.mixedFactoryMethod.factory;

import designPattern.factoryPattern.mixedFactoryMethod.pojo.MiPhone;
import designPattern.factoryPattern.mixedFactoryMethod.pojo.Phone;

public class MiFactory implements AbstractFactory {
    public Phone makePhone() {
        return new MiPhone();
    }
}
