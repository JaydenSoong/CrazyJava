package classes;

import java.util.Objects;

public class ObjectsTest {

    static ObjectsTest ot;

    public static void main(String[] args) {
        // 输出一个空对象的 hashCode 值，0
        System.out.println(Objects.hashCode(ot));
        // 输出一个空对象的 toString
        // null
        System.out.println(Objects.toString(ot));
        // 要求 ot 不能为 null，如果为空，将引发异常
        System.out.println(Objects.requireNonNull(ot, "ot 参数不能是 null"));

    } 
}
