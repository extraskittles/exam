package ProxyPattern.JDKDenamicProxy;

public class Main {
    public static void main(String[] args) {
        Book bookProxy = new JDKdenamicProxy(new RealBook()).getBookProxy();
        bookProxy.addBook();
        bookProxy.deleteBook();
    }
}
