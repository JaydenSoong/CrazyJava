package classes;


class Person{

    // 定义了一个实例变量
    public String name;
    // 定义了一个类变量
    public static int eyeNum;
}


public class PersonTest{
    
    public static void main(String[] args){
        // 第一次主动使用 Person 类，该类自动初始化，则 eyeNum 开始起作用，输出 0
        System.out.println("Person 的 eyeNum 的值是：" + Person.eyeNum);

        // 创建 Person 对象
        Person p = new Person();

        // 通过引用变量 p 来访问 Person 对象的 name 实例变量
        // 通过实例访问 eyeNum 类变量
        System.out.println("p 变量的 name 值是：" + p.name + " p 对象的 eyeNum 变量值是：" + p.eyeNum);

        // 直接为 name 实例变量赋值。
        p.name = "孙悟空";
        // 通过 p 访问 eyeNum 类变量
        p.eyeNum = 2;

        System.out.println("p 变量的 name 值是：" + p.name + " p 对象的 eyeNum 变量值是：" + p.eyeNum);

        Person p2 = new Person();
        System.out.println("p2 对象的 eyeNum 类变量的值是：" + p2.eyeNum);
    }
    
}
