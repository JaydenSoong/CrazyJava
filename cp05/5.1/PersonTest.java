package classes;

public class PersonTest{
    
    public static void main(String[] args){
        
        // 使用 Person 类定义一个变量
        Person p;

        // 使用 Person 类创建一个实例，并将其赋值给之前创建的变量
        p = new Person();

        // 上面两个语句可以简写成如下形式
        // Person p = new Person();

        // 访问 p 的 name 成员变量，并赋值
        p.name = "李刚";

        // 访问 p 的方法
        p.say("Java 语言很简单，学习很容易");

        // 直接输出 p 的 name 成员变量
        System.out.println(p.name);

        // 将 p 变量赋值给 p2 变量
        Person p2 = p;
    }
    
}
