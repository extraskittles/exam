package ProxyPattern.staticProxy2;

public class ProxyChild extends Child{
    public ProxyChild(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("洗手");
        super.eat();
    }
}
