package factoryPattern.mixedFactoryMethod.factory;

import factoryPattern.mixedFactoryMethod.pojo.Iphone;
import factoryPattern.mixedFactoryMethod.pojo.Phone;

public class IphoneFactory implements AbstractFactory {
    public Phone makePhone() {
        return new Iphone();
    }
}
