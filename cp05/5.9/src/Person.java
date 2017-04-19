package classes;


public class Person{
    // 定义一个普通初始化块
    {
        int a = 6;

        if(a > 4){
            System.out.println("Person 的初始化块，局部变量 a 的值大于 4");
        }
        System.out.println("Person 的初始化块");
    }

    // 定义第二个普通初始化块
    {
        System.out.println("Person 的第二个初始化块");
    }

    // 定义无参数构造器
    public Person(){
        System.out.println("Person 的无参数构造器");
    }

    public static void main(String[] args){
        // 输出
        // Person 的初始化块，局部变量 a 的值大于 4
        // Person 的初始化块
        // Person 的第二个初始化块
        // Person 的无参数构造器
        Person p = new Person();
    }
} 
