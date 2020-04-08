package designPattern.singletonPattern;
//懒汉单例模式(synchronize修饰方法)
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}
    public static synchronized Singleton3 getInstance(){
        if(instance==null){
            instance=new Singleton3();
        }
        return instance;
    }
}
