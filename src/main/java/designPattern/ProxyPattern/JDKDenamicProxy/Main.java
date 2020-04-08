package designPattern.ProxyPattern.JDKDenamicProxy;

public class Main {
    public static void main(String[] args) {
        Book bookProxy = new JDKdenamicProxy(new RealBook()).getBookProxy();
        System.out.println("main方法的proxy对象："+bookProxy);
        bookProxy.addBook();
        bookProxy.deleteBook();
    }
}
