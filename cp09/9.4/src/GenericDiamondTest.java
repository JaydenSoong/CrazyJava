package classes;

class MyClass<E> {
    public <T> MyClass(T t){
        System.out.println("t 参数为：" + t);
    }
}


public class GenericDiamondTest {
    
    public static void main (String[] args) {
        // MyClass 类声明中的E形参是String类型
        // 泛型构造器中声明的T形参是Integer类型
        MyClass<String> mc1 = new MyClass<>(5);     
        // 显示指定泛型构造器中声明的T形参是Integer类型
        MyClass<String> mc2 = new <Integer> MyClass<String>(5);     
        // MyClass类声明中的E形参是String类型的
        // 如果显示指定泛型构造器中声明的T形参是Integer类型
        // 此时就不能使用“菱形”语法，下面代码是错误的
        // MyClass<String> mc3 = new <String> MyClass<>();
    }
}


