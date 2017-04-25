package classes;


public class IntegerCacheTest {

    public static void main(String[] args) {
        // 生成新的 Integer 对象
        Integer in1 = new Integer(6);
        // 生成新的 Integer 对象，并缓存
        Integer in2 = Integer.valueOf(6);
        // 直接取出缓存对象
        Integer in3 = Integer.valueOf(6);
        // fasle
        System.out.println(in1 == in2);
        // true
        System.out.println(in3 == in2);

        // Integer 只缓存 -128～127 之间的值
        Integer in4 = Integer.valueOf(200);
        Integer in5 = Integer.valueOf(200);
        // false
        System.out.println(in4 == in5);
    }
}
