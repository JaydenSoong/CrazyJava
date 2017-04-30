package classes;


public class Outer {
    private int outProp = 9;

    public class Inner {
        private int inProp = 5;

        public void accessOuterProp() {
            // 直接访问外部类的私有成员变量
            System.out.println("外部类的 prop 值：" + outProp);
        }
    }

    public void accessInnerProp() {
        // 编译错误: 找不到符号（外部类不能直接访问内部类的私有变量）
        // System.out.println("内部类的 prop 值：" + inProp);
        // 如需访问内部类的私有变量，则必须显示地创建内部类对象
        System.out.println("内部类的 prop 值：" + new Inner().inProp);
    }

    public static void main(String[] args) {
        // 执行下面代码，只创建了外部类对象，还没有创建内部类对象
        Outer o = new Outer();
        o.accessInnerProp();
    }
}
