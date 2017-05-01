package classes;


abstract class Device {
    private String name;

    public abstract double getPrice();

    public Device(){}

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class AnonymousInner {
    
    public void test(Device d) {
        System.out.println("购买了一个" + d.getName() + "，花掉了" + d.getPrice());
    }

    public static void main(String[] args) {
        AnonymousInner ai = new AnonymousInner();
        // 调用有参数的构造器创建 Device 匿名实现类对象
        ai.test(new Device("电子示波器") {
            public double getPrice() {
                return 67.8;
            }
        });
    
        Device d = new Device() {
            // 初始化块
            {
                System.out.println("匿名内部类的初始化块");
            }
            // 实现抽象方法
            public double getPrice() {
                return 56.3;
            }
            // 重写父类的实例方法
            public String getName() {
                return "键盘";
            }
        };
        ai.test(d);
    }
}
