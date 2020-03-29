package ProxyPattern.cglibDenamicProxy;

import org.springframework.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Phone.class);
        enhancer.setCallback(new MyMethodInterceptor());
        Phone proxyPhone =(Phone) enhancer.create();
        proxyPhone.call();
        proxyPhone.play();
    }
}
