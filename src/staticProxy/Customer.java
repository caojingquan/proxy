package staticProxy;

public class Customer implements  Person {

    @Override
    public void findHouse() {
        System.out.println("我要找个三室一厅");
    }
}
