package factoryPattern.mixedFactoryMethod.factory;

import factoryPattern.mixedFactoryMethod.pojo.MiPhone;
import factoryPattern.mixedFactoryMethod.pojo.Phone;

public class MiFactory implements AbstractFactory {
    public Phone makePhone() {
        return new MiPhone();
    }
}
