package classes;

/**
 * 不管为泛型的类型传入了哪一种类型实参，对于 Java 来说，它们依然被当成同一
 * 个类，在内存中也只占用一块内存空间，因此，在静态方法，静态初始化块或者静
 * 态变量的声明和初始化中不允许使用类型形参
 */
public class R<T> {
    // 下面代码错误——不能在静态变量声明中使用类型形参
    static T info;
    T age;
    public void info(T msg) {}
    // 下面代码错误——不能在静态方法声明中使用类型形参
    public static void bar(T msg) {}
}
