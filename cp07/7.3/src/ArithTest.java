package classes;

public class ArithTest {

    public static void main(String[] args) {
        System.out.println("0.05 + 0.01 = " + Arith.add(0.05, 0.01));
        System.out.println("1 - 0.42 = " + Arith.sub(1, 0.42));
        System.out.println("4.015 x 100 = " + Arith.mul(4.015, 100));
        System.out.println("123.3 / 100 = " + Arith.div(123.3, 100));
    }
}
