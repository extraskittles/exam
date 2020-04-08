package designPattern.factoryPattern.abstractFactory.factory;

import designPattern.factoryPattern.abstractFactory.pojo.Phone;
import designPattern.factoryPattern.abstractFactory.pojo.Watch;

public interface AbstractFactory {
    Phone makePhone();
    Watch makeWatch();
}
