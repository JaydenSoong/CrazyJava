package classes;


class Base{
    // 父类构造器
    public Base(){
        test();
    }

    public void test(){
        System.out.println("将被子类重写的方法");
    }
}


public class Sub extends Base{
    private String name;

    public void test(){
        // name 为 null，调用方法会引发异常
        System.out.println("重写父类方法，其 name 的长度为" + name.length());
    }

    public static void main(String[] args){
        // 运行时会引发异常
        Sub s = new Sub();
    }
}
