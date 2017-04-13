package classes;

public class StaticAccessNoStatic{

    public void info(){
        System.out.println("简单的 info 方法");
    }

    public static void main(String[] args){

        // main() 是静态的
        // info() 不是静态的
        // 调用 main 方法的是该类本身，而不是该类的实例。因此省略的 this 无法指向有效的对象

        // info();

        // 可改为如下形式
        new StaticAccessNoStatic().info();
    }
}

// 编译错误
// StaticAccessNoStatic.java:10: 错误: 无法从静态上下文中引用非静态 方法 info()
