package staticProxy;

public class ZhongJie implements Person {
    Customer customer;
    public ZhongJie(Customer p){
        this.customer = p;
    }

    @Override
    public void findHouse() {
        before();
        customer.findHouse();
        after();
    }

    private void before(){
        System.out.println("查找一下房源资料");
    }

    private void after(){
        System.out.println("查看满意的话就租房吧");
    }
}
