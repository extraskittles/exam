package designPattern.ProxyPattern.staticProxy;

public class ProxyChild implements Activity{
    private String name;
    private Activity child;
    public ProxyChild(String name){
        this.name=name;
        child=new Child(name);
        this.child=child;
    }
    public void eat() {
        System.out.println("洗手");
        child.eat();
    }
}
