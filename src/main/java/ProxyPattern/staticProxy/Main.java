package ProxyPattern.staticProxy;

public class Main {
    public static void main(String[] args) {
        ProxyChild proxyChild = new ProxyChild("小明");
        proxyChild.eat();
    }
}
