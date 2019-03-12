package jdkProxy;

public class JdkProxyTest {

    public static void main(String[] args) {
        ((Person)new ZhongJie(new Customer()).getInstance()).findHouse();
    }
}
