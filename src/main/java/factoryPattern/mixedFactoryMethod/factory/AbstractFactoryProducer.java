package factoryPattern.mixedFactoryMethod.factory;

public class AbstractFactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if("apple".equalsIgnoreCase(factoryType)){
            return new IphoneFactory();
        }else if("mi".equalsIgnoreCase(factoryType)){
            return new MiFactory();
        }else {
            return null;
        }
    }
}
