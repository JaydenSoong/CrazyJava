package classes;


public class DiscernVariable {
    private String prop = "外部类的实例变量";

    private class InClass {
        private String prop = "内部类的实例变量";

        public void info() {
            String prop = "局部变量";
            
            // 通过 外部类名.this.varName 访问外部类实例变量
            System.out.println("外部类的实例变量值：" + DiscernVariable.this.prop);
            // 通过 this.varName 访问内部类实例变量
            System.out.println("内部类的实例变量值：" + this.prop);
            // 直接访问局部变量
            System.out.println("局部变量值：" + prop);
        }
    }

    public void test() {
        InClass ic = new InClass();
        ic.info();
    }

    public static void main(String[] args) {
        DiscernVariable dv = new DiscernVariable();
        dv.test();
    }
}
