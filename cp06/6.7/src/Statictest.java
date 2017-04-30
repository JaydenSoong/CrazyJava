package classes;


public class StaticTest {
    // 定义一个非静态内部类，是一个空类
    private class In{}

    // 外部类的静态方法
    public static void main(String[] args) {
        // 编译错误: 无法从静态上下文中引用非静态 变量 this
        // 静态成员（main 方法）无法访问非静态成员（In 类）
        new In();
    }
}
