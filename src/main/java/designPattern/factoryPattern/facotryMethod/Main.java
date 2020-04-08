package designPattern.factoryPattern.facotryMethod;

import designPattern.factoryPattern.facotryMethod.factory.AbstractFactory;
import designPattern.factoryPattern.facotryMethod.factory.MiFactory;
import designPattern.factoryPattern.facotryMethod.pojo.Phone;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory=new MiFactory();
        Phone phone = factory.makePhone();
        System.out.println(phone);
    }
}
