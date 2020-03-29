package ProxyPattern.staticProxy2;

public class Main {
    public static void main(String[] args) {
        ProxyChild proxyChild = new ProxyChild("小明");
        proxyChild.eat();
    }
}
