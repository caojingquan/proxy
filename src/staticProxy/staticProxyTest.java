package staticProxy;

public class staticProxyTest {

    public static void main(String[] args) {
        ZhongJie zj = new ZhongJie(new Customer());
        zj.findHouse();
    }
}
