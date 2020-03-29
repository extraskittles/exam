package ProxyPattern.staticProxy;

public class Child implements Activity{
    private String name;
    public Child(String name){
        this.name=name;
    }
    public void eat() {
        System.out.println("吃饭");
    }
}
