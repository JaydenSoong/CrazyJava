package classes;


public class Overload{

    // 下面定义了两个 test 方法，但方法的形参列表不同。
    // 系统可以区分这两个方法，这被称为方法的重载。
    public static void test(){
        System.out.println("无参数");    
    }

    public static void test(String msg){
        System.out.println("重载的 test 方法 " + msg);
    }

    public static void main(String[] args){
        Overload vl = new Overload();
        vl.test();
        vl.test("hello");
    }
}
