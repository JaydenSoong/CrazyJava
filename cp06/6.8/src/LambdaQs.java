package classes;


interface Eatable {
    void taste();
}


interface Flyable {
    void fly(String weather);
}


interface Addable {
    int add (int a, int b);
}


public class LambdaQs {

    // 调用该方法需要 Eatable 对象
    public void eat(Eatable e) {
        System.out.println(e);
        e.taste();
    }

    // 调用该方法需要 Flyable 对象
    public void drive(Flyable f) {
        System.out.println("我正在驾驶：" + f);
        f.fly("【碧空如洗的晴日】");
    }

    // 调用该方法需要 Addable 对象
    public void test(Addable add) {
        System.out.println("5 与 3 的和为：" + add.add(5, 3));
    }

    public static void main(String[] args) {
        
        LambdaQs lq = new LambdaQs();
        // Lambda 表达式的代码块只有一条语句，可以省略花括号
        lq.eat(()->System.out.println("苹果的味道真不错"));
        // Lambda 表达式的形参列表只有一个形参，可以省略圆括号
        lq.drive(weather -> {
            System.out.println("今天的天气是：" + weather);
            System.out.println("直升机飞行平稳");
        });
        /*
         * Lambda 表达式的代码块只有一条语句，可以省略花括号，
         * 代码块中只有一条语句，即使该表达式需要返回值,也可以省略 return 关键字
         */
        lq.test((a, b) -> a + b);
    }

}
