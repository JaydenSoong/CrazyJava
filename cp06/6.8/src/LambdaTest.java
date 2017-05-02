package classes;


@FunctionalInterface
interface FkTest {
    void run();
}


public class LambdaTest {

    // Runnable 接口中只包含一个无参数的方法
    // Lambda 表达式代表的匿名方法实现了 Runnable 接口中的唯一的、无参数的方法
    // 因此，下面的 Lambda 表达式创建了一个 Runnable 对象
    Runnable r = () -> {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    };

    // 编译错误: 不兼容的类型: Object 不是函数接口
    /*
        Object o = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
        };
    */

    // 使用 @FunctionalInterface 对 Lambda 表达式进行强制类型转换
    Object o = (Runnable) () -> {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    };

    // 同样的 Lambda 表达式可以被当成不同的目标类型，唯一的要求是
    // Lambda 表达式的形参列表与函数式接口中唯一的抽象方法的形参列表相同
    Object o2 = (FkTest) () -> {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    };
}
