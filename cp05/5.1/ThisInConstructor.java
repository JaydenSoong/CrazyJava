package classes;

public class ThisInConstructor{

    // 定义成员变量 foo
    int foo;

    public ThisInConstructor(){
        // 在构造方法里定义了与成员变量相同的局部变量
        int foo;

        // 当方法里出现了相同的变量时，关键字 this 是不能省略的。
        this.foo = 6;
    }

    public static void main(String[] args){
        // 输出对象的 foo 值。由于是在构造器里设置的 foo 的值。
        // 因此，所有对象的 foo 值都是相同的
        System.out.println(new ThisInConstructor().foo);
    }
}
