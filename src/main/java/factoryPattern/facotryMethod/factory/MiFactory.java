package factoryPattern.facotryMethod.factory;

import factoryPattern.facotryMethod.pojo.MiPhone;
import factoryPattern.facotryMethod.pojo.Phone;

public class MiFactory implements AbstractFactory{
    public Phone makePhone() {
        return new MiPhone();
    }
}
