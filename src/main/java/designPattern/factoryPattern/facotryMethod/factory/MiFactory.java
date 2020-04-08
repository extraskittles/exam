package designPattern.factoryPattern.facotryMethod.factory;

import designPattern.factoryPattern.facotryMethod.pojo.MiPhone;
import designPattern.factoryPattern.facotryMethod.pojo.Phone;

public class MiFactory implements AbstractFactory{
    public Phone makePhone() {
        return new MiPhone();
    }
}
