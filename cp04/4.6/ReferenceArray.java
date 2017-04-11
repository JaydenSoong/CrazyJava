package classes;

class Person{
    // 年龄
    public int age;
    // 身高
    public double height;

    // 定义一个 info() 方法。
    public void info(){
        System.out.println("我的年龄是：" + age + "，我的身高是：" + height);
    }
}


public class ReferenceArray{

    public static void main(String[] args){
        // 定义一个数组，并动态初始化
        Person[] students = new Person[2];

        // new 一个 Person 对象，并将其赋给 zhang
        Person zhang = new Person();
        // 确定 zhang 的年龄、身高
        zhang.age = 23;
        zhang.height = 173.0;

        // new 一个 Person 对象，并将其赋给 lee
        Person lee = new Person();
        // 确定 lee 的年龄、身高
        lee.age = 31;
        lee.height = 167.5;

        // 将 zhang 赋给 students[0]
        students[0] = zhang;
        // 将 lee 赋给 students[1]
        students[1] = lee;

        // 下面两句代码结果是一样的。
        // 因为 zhang 和 students[0] 指向的是同一个 Person 实例
        zhang.info();
        students[0].info();
    }
}
