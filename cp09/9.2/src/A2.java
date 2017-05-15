package classes;

/**
 * 如果使用 Apple 类时没有传入实际的参数类型，Java 编译器可能发出警告：
 * 使用了未经检查或不安全的操作——这就是泛型检查的警告。
 * 此时，系统会把 Apple<T> 类里的 T 形参当成 Object 类型处理
 */
public class A2 extends Apple {

    /**
     * 重写父类方法
     */
    public String getInfo() {
        // super.getInfo() 的返回值是 Object 类型，所以加 toString() 才
        // 返回 String 类型
        return super.getInfo().toString();
    }
}
