package classes;

import java.util.Collection;
import java.util.ArrayList;

/**
 * 泛型方法演示
 */
public class GenericMethodTest {
    
    /**
     * 泛型方法
     * 将数组中的元素添加到集合中去
     */
    public static <T> void arrayToCollection(T[] a, Collection<T> c) {
        for(T o : a) {
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<>();
        // 下面代码中 T 代表 Object 类型
        arrayToCollection(oa, co);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<>();
        // 下面代码中 T 代表 String 类型
        arrayToCollection(sa, cs);

        // 下面代码中 T 代表 Object 类型
        arrayToCollection(sa, co);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList<>();

        // 下面代码中 T 代表 Number 类型
        arrayToCollection(na, cn);
        // 下面代码中 T 代表 Number 类型
        arrayToCollection(ia, cn);
        // 下面代码中 T 代表 Number 类型
        arrayToCollection(fa, cn);
        // 下面代码中 T 代表 Object 类型
        arrayToCollection(fa, co);

        // 下面代码中 T 代表 String 类型，但 na 是一个 Number 数组
        // 因为 Number 既不是 String 类型，也不是其子类
        // 所以代码将出现编译错误
        arrayToCollection(na, cs);
    }
}
