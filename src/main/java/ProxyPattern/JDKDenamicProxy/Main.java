package ProxyPattern.JDKDenamicProxy;

public class Main {
    public static void main(String[] args) {
        Book bookProxy = new JDKBookProxy().getBookProxy(new RealBook());
        bookProxy.addBook();
        bookProxy.deleteBook();
    }
}
