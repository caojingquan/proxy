package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Customer implements  Person{
    @Override
    public void findHouse() {
        System.out.println("客户说：我要租一个三室一厅");
    }
}
