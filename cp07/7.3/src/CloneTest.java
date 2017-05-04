package classes;

class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    } 
}


// 实现 Cloneable 接口
class User implements Cloneable {
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        address = new Address("四川成都");
    }

    public User clone() throws CloneNotSupportedException {
        // 调用 super.clone() 来实现 clone() 方法
        return (User) super.clone();
    }
}


public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        User u1 = new User(31);
        // clone 得到 u1 对象的副本
        User u2 = u1.clone();

        // 判断 u1、u2 是否相等
        System.out.println(u1 == u2);
        // 判断 u1、u2 的 address 是否相等
        System.out.println(u1.address == u2.address);
    }
}
