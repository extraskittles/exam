package factoryPattern.mixedFactoryMethod.factory;

import factoryPattern.mixedFactoryMethod.pojo.Phone;

public interface AbstractFactory {
    Phone makePhone();
}
