package classes;


interface Product {
    double getPrice();
    String getName();
}


public class AnonymousTest {

    public void test(Product p) {
        System.out.println("购买了一个" + p.getName() + "，花了 " + p.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest at = new AnonymousTest();
        // 调用 test() 方法时，需要传入一个 Product 参数
        // 这里传入其匿名实现类的实例
        at.test(new Product() {
            public double getPrice(){
                return 354.8;
            }
            
            public String getName() {
                return " 显卡";
            }
        });
    }

}
