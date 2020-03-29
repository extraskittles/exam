package ProxyPattern.JDKDenamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKBookProxy implements InvocationHandler {
    private Book target;
    public Book getBookProxy(Book target){
        this.target=target;
        return (Book)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        if(method.getName().equalsIgnoreCase("addBook")){
            System.out.println("添加书前的操作");
            result = method.invoke(target, args);
            System.out.println("添加书后的操作");
        }else{
            result = method.invoke(target, args);
        }
        return result;
    }
}
