package classes;

public class Dog{

    // 定义一个 jump 方法
    public void jump(){
        System.out.println("正在执行 jump 方法");
    }

    // 定义一个 run 方法，需要调用到 jump 方法
    public void run(){

        // 这种写法将会产生两个 Dog 对象。显然是不对的。
        // Dog d = new Dog();
        // d.jump();

        // 这里要用到 this 关键字。谁在调用，this 就代表谁。
        // this.jump();

        // Java 允许一个成员直接调用另一个成员，可以省略 this 前缀
        jump();

        System.out.println("正在执行 run 方法");
    }
}
