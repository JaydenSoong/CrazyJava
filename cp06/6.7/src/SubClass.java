package classes;


public class SubClass extends Out.In {

    // 显示定义 SubClass 的构造器
    public SubClass(Out out) {
        // 通过传入的 Out 对象来显示的调用 In 的构造器
        out.super("hello");
    }
}
