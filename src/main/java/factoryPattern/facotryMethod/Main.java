package factoryPattern.facotryMethod;

import factoryPattern.facotryMethod.factory.AbstractFactory;
import factoryPattern.facotryMethod.factory.MiFactory;
import factoryPattern.facotryMethod.pojo.Phone;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory=new MiFactory();
        Phone phone = factory.makePhone();
        System.out.println(phone);
    }
}
