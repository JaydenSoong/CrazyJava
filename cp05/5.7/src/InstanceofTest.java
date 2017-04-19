package classes;


public class InstanceofTest{

    public static void main(String[] args){
        // hello, 编译时类型是 Object，运行时类型是 String
        Object hello = "Hello, World";
        System.out.println("字符串是否是 Object 类的实例：" + (hello instanceof Object));   // true
        System.out.println("字符串是否是 String 类的实例：" + (hello instanceof String));   // true
        System.out.println("字符串是否是 Math 类的实例：" + (hello instanceof Math));   //false
        // String 实现了 Comparable 接口
        System.out.println("字符串是否是 Comparable 接口的实例：" + (hello instanceof Comparable)); //true

        String a = "Hello, World";
        // 编译不能通过，因为 a 的编译时类型是 String，和 Math 不存在继承关系
        // System.out.println("字符串是否是 Math 类的实例：" + (a instanceof Math));   
    }
}
