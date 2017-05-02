package classes;

import javax.swing.JFrame;

interface Converter {
    Integer convert(String from);
}


@FunctionalInterface
interface MyTest {
    String test(String a, int b, int c);
}


@FunctionalInterface
interface YourTest {
    JFrame win(String a);
}


public class MethodRefer {
    
    public static void main(String[] args) {
        // 下面代码使用 Lambda 表达式创建 Converter 对象
        Converter converter1 = from -> Integer.valueOf(from);

        // 方法引用代替 Lambda 表达式：引用类方法
        // 函数式接口中被实现方法的全部参数传给该类方法作为参数
        Converter converter2 = Integer :: valueOf;

        System.out.println(converter1.convert("99"));
        System.out.println(converter2.convert("98"));

        // 下面代码使用 Lambda 表达式创建对象
        Converter converter3 = from -> "fkit.org".indexOf(from);
        Integer value = converter3.convert("it");
        // 2
        System.out.println(value);
        // 方法引用代替 Lambda 表达式：引用特定对象的实例方法
        // 函数式接口中被实现的全部参数传递给该方法作参数。
        Converter converter4 = "fkit.org" :: indexOf;
        System.out.println(converter4.convert("it"));

        // 使用 Lambda 表达式创建 MyTest 对象
        MyTest mt = (a, b, c) -> a.substring(b, c);
        String str = mt.test("Java I love you.", 2, 9);
        System.out.println(str);

        // 方法引用代替 Lambda 表达式，引用某类对象的实例方法
        // 函数式接口中被实现的方法的第一个参数作为调用者
        // 后面的参数全部传给该方法作为参数
        mt = String :: substring;
        str = mt.test("Java I love you.", 2, 9);
        System.out.println(str);

        // 使用 Lambda 表达式创建 YourTest 对象
        YourTest yt = (String a) -> new JFrame(a);
        JFrame jf = yt.win("我的窗口");
        System.out.println(jf);

        // 构造器引用代替 Lambda 表达式
        // 函数式接口中被实现的方法的全部参数作为参数传递给该构造器作为参数
        yt = JFrame :: new;
        jf = yt.win("我的窗口");
        System.out.println(jf);
    }
}
