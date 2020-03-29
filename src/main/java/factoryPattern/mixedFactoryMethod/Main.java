package factoryPattern.mixedFactoryMethod;

import factoryPattern.mixedFactoryMethod.factory.AbstractFactory;
import factoryPattern.mixedFactoryMethod.factory.AbstractFactoryProducer;

public class Main {
    public static void main(String[] args) {
        AbstractFactory mi = AbstractFactoryProducer.getFactory("mi");
        System.out.println(mi.makePhone());
    }
}
