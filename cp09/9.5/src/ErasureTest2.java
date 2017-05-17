package classes;

import java.util.List;
import java.util.ArrayList;

public class ErasureTest2 {

    public static void main (String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(6);
        li.add(9);
        List list = li;
        // 下面的代码引起“未经检查的转换”警告，编译、运行完全正常
        List<String> ls = list;
        // 但只要访问 ls 里的元素，如下面的代码将引起运行时异常
        System.out.println(ls.get(0));
    }
}
