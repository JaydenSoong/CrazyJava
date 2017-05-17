package classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class MyUtils {

    // 下面dest集合元素的类型必须与src集合的元素的类型相同，或是其父类
    static <T> T copy(Collection<? super T> dest, Collection<T> src) {
        T last = null;
        for(T t : src) {
            last = t;
            dest.add(t);
        }
        return last;
    }

    public static void main(String[] args){
        List<Number> ln = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        li.add(5);
        // 此处可准确的知道最后一个被复制的元素是Integer
        // 与src集合元素的类型相同
        Integer last = copy(ln, li);
        System.out.println(ln);
    }
}
