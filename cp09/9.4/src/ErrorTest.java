package classes;

import java.util.Collection;
import java.util.ArrayList;

/**
 * 泛型方法的错误演示
 */
public class ErrorTest {

    /**
     * 泛型方法
     * 将一个集合中的元素添加到另一个集合中
     */
    static <T> void test(Collection<T> from, Collection<T> to) {
        for(T o : from) {
            to.add(o);
        }
    }

    public static void main(String[] args) {
        Collection<String> cs = new ArrayList<>();
        Collection<Object> co = new ArrayList<>();
        // 下面语句将编译错误
        test(cs, co);
    }
} 
