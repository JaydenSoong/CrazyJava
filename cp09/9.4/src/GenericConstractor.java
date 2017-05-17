package classes;


class Foo {
    /**
     * 泛型构造器
     * 1、可以让 Java 根据数据参数的类型来推断类型形参的类型
     * 2、可以显示地为构造器中的类型形参指定实际的类型
     */
    public <T> Foo(T t){
        System.out.println(t);
    }
}


public class GenericConstractor {
    public static void main(String[] args) {
        // Java 自动推断类型形参为 String
        new Foo("疯狂 Java 讲义");
        // Java 自动推断类型形参为 Double
        new Foo(3.14);
        // 指定类型为 String，传入的实参也是 String
        new <String> Foo("疯狂 Java 讲义");
        // 指定类型为 String，传入的实参是 Integer
        // 编译错误：不兼容的类型: int无法转换为String
        // new <String> Foo(4);
    }
}
