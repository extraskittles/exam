package designPattern.ProxyPattern.staticProxy2;

public class Main {
    public static void main(String[] args) {
        Child proxyChild = new ProxyChild("小明");
        System.out.println(proxyChild.getName());
    }
}
