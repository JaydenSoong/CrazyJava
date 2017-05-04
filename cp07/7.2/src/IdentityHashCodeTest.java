package classes;


public class IdentityHashCodeTest {

    public static void main(String[] args) {
        // s1 和 s2 是两个不同的对象
        String s1 = new String("hello");
        String s2 = new String("hello");

        // String 重写了 hashCode() 方法——改为根据字符序列计算 hashCode 值
        // 因为 s1 和 s2 的字符序列相同，所以它们的 hashCode() 方法的返回值相同
        System.out.println(s1.hashCode() + " ---- " + s2.hashCode());
        // s1 和 s2 是不同的对象，所以它们的 identityHashCode 值不同
        System.out.println(System.identityHashCode(s1) + " ---- " + System.identityHashCode(s2));

        String s3 = "Java";
        String s4 = "Java";
        // s3 和 s4 是同一个对象，所以它们的 identityHashCode 值相同
        System.out.println(System.identityHashCode(s3) + " ---- " + System.identityHashCode(s4));
    }
}
