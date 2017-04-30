package classes;


public class Cow {
    private double weight;

    // 外部类里的两个重载构造器
    public Cow(){}

    public Cow(double weight) {
        this.weight = weight;
    }

    // 定义一个非静态内部类
    private class CowLeg {
        // 非静态类里的两个实例变量
        private double height;
        private String color;

        // 非静态内部类的两个重载构造器
        public CowLeg(){}

        public CowLeg(double height, String color){
            this.height = height;
            this.color = color;
        }

        // 非静态内部类的两个实例方法
        public void info() {
            System.out.println("当前牛腿的颜色是：" + color + "，高：" + height);
            // 直接访问外部类的 private 修饰的成员变量
            System.out.println("本牛腿所在牛的重是：" + weight);
        }
    }

    public void test() {
        CowLeg cl = new CowLeg(1.12, "黑白相间");
        cl.info();
    }

    public static void main(String[] args) {
        Cow c = new Cow(321.5);
        c.test();
    }
}
