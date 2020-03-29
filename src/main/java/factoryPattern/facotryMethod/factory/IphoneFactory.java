package factoryPattern.facotryMethod.factory;

import factoryPattern.facotryMethod.pojo.Iphone;
import factoryPattern.facotryMethod.pojo.Phone;

public class IphoneFactory implements AbstractFactory{
    public Phone makePhone() {
        return new Iphone();
    }
}
