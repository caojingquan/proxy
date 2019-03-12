package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ZhongJie implements InvocationHandler {
    private Object obj;

    public ZhongJie(Person person){
        this.obj = person;
    }

    public Object getInstance(){
        Class clazz = obj.getClass();
        return Proxy.newProxyInstance(this.obj.getClass().getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.obj,args);
        after();
        return obj;
    }

    /**
     *  感觉这个增强和反射后的处理操作可以通过两个不同的接口实现
     *  这样可以将如何增强的逻辑可以放到不同的实现中
     */
    private Object before(){
        System.out.println("在调用传进来的参数的接口方法前可以可以做一下对对象的处理操作");
        return null;
    }

    private Object after(){
        System.out.println("这是调用了反射后的操作了");
        return null;
    }
}
