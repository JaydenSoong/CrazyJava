package classes;

class BaseClass{
    int a = 5;
}


public class SubClass extends BaseClass{
    // 与父类同名的实例变量，将隐藏父类的该变量
    int a = 7;

    void AccessOwn(){
        // 将输出子类自己定义的 a
        System.out.println(a);
    }

    void AccessBase(){
        // 使用 super 访问父类的 a
        System.out.println(super.a);
    }

    public static void main(String[] args){
        // 创建子类对象
        SubClass sc = new SubClass();
        // 输出 7
        sc.AccessOwn();
        // 输出 5
        sc.AccessBase();
    }

}
