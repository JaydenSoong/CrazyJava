package classes;

class Person{
    // 重写 equals 方法，不加判断，都返回 true
    public boolean equals(Object obj){
        return true;
    }
}


// Dog 是一个空类
class Dog{}


public class OverrideEqualsError{

    public static void main(String[] args){
        Person p = new Person();
        System.out.println("Person 对象是否 equals Dog 对象？"  + p.equals(new Dog()));
        System.out.println("Person 对象是否 equals String 对象？"  + p.equals(new String("Hello")));
    }
}
