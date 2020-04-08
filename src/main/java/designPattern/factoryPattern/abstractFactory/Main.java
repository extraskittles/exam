package designPattern.factoryPattern.abstractFactory;

import designPattern.factoryPattern.abstractFactory.factory.AbstractFactory;
import designPattern.factoryPattern.abstractFactory.factory.AppleFactory;
import designPattern.factoryPattern.abstractFactory.factory.MiFactory;

public class Main {
    public static void main(String[] args) {
       AbstractFactory abstractFactory= new AppleFactory();
        System.out.println( abstractFactory.makePhone());
        System.out.println(abstractFactory.makeWatch());
        AbstractFactory abstractFactory2= new MiFactory();
        System.out.println( abstractFactory2.makePhone());
        System.out.println(abstractFactory2.makeWatch());
    }
}
