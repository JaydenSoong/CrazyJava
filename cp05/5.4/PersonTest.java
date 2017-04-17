package classes;

public class PersonTest{

    public static void main(String[] args){

        Person p = new Person();
        // 下面的代码将出错。不能直接访问私有变量
        // p.age = 45;
        // 下面的代码将不会改变 age 的值。
        p.setAge(150);
        System.out.println("未能设置 age 成员变量时：" + p.getAge());
        // 成功设置 age 成员变量
        p.setAge(33);
        System.out.println("设置 age 成员变量后：" + p.getAge());
        p.setName("李刚");
        System.out.println("成功设置 name 成员变量后：" + p.getName());
    }
}
