package classes;

import java.util.Collection;
import java.util.ArrayList;

/**
 * 泛型方法正确演示
 */
public class RightTest {

    /**
     * 泛型方法
     */
    static <T> void test(Collection<? extends T> from, Collection<T> to){
        for(T o : from) {
            to.add(o);
        }
    }

    public static void main(String[] args) {
        Collection<String> cs = new ArrayList<>();
        Collection<Object> co = new ArrayList<>();
        // 通过编译
        test(cs, co);
    }
}
