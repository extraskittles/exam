package singletonPattern;
//枚举类实现单例
public enum Singleton5 {
    INSTANCE,
    INSTANCE2("1");
    private String a;
    private Singleton5(){}
    private Singleton5(String a){
        this.a=a;
    }
}
