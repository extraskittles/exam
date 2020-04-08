package designPattern.ProxyPattern.cglibDenamicProxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object object2=null;
        if(method.getName().equalsIgnoreCase("play")){
            System.out.println("玩手机前的准备");
             object2 = methodProxy.invokeSuper(o, objects);
        }else{
            object2 = methodProxy.invokeSuper(o, objects);
        }
        return object2;
    }
}
