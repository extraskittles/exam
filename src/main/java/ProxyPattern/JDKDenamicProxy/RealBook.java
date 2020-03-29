package ProxyPattern.JDKDenamicProxy;

public class RealBook implements Book{
    public void addBook() {
        System.out.println("增加书");
    }

    public void deleteBook() {
        System.out.println("删除书");
    }
}
