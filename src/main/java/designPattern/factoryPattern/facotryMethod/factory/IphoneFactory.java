package designPattern.factoryPattern.facotryMethod.factory;

import designPattern.factoryPattern.facotryMethod.pojo.Iphone;
import designPattern.factoryPattern.facotryMethod.pojo.Phone;

public class IphoneFactory implements AbstractFactory{
    public Phone makePhone() {
        return new Iphone();
    }
}
