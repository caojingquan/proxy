package mySelfProxy;

public class Meipo implements  MyselfInvocationHandler{

    private Object obj;

    public Meipo(Person person){
        this.obj = person;
    }

    public Object getInstance(){
        Class clazz = this.obj.getClass();
        return MyselfProxy.newInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke() {
        return null;
    }
}
