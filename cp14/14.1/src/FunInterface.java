package classes;

@FunctionalInterface
public interface FunInterface {
    static void foo() {
        System.out.println("foo 类方法");
    }

    default void bar() {
        System.out.println("bar 默认方法");
    }

    void test();
}
