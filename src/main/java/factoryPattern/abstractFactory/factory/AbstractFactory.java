package factoryPattern.abstractFactory.factory;

import factoryPattern.abstractFactory.pojo.Phone;
import factoryPattern.abstractFactory.pojo.Watch;

public interface AbstractFactory {
    Phone makePhone();
    Watch makeWatch();
}
