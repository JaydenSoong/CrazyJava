package soong;


// 接口的修饰符只能是 public 或默认
public interface Output {

    // 接口里的只能定义常量，不管有没有加 public static final 效果都是一样的
    int MAX_CACHE_LINE = 50;

    // 接口里的定义的普通方法只能是 public 修饰的抽象方法
    void out();
    void getData(String msg);

    // 接口里定义的默认方法需 default 修饰，默认方法要提供方法实现
    default void print(String... msgs) {
        for(String str : msgs) {
            System.out.println(str);
        }
    }

    // 接口里定义的默认方法需 default 修饰，默认方法要提供方法实现
    default void test() {
        System.out.println("默认的 test() 方法");
    }

    // 接口里可以提供类方法
    static String staticTest() {
        return "接口里的类方法";
    }
}
