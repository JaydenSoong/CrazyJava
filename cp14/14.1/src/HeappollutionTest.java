package classes;

import java.util.List;
import java.util.ArrayList;

/**
 * 堆污染演示
 * 当把一个不带泛型的对象赋给一个带泛型的变量时，往往就会发生这种“堆污染”
 */
public class HeappollutionTest {
     public static void main (String [] args) {
         List list = new ArrayList<Integer>();
         list.add(20); //添加元素时引发unchecked异常
         //下面代码引起未经检查的转换的警告，编译、运行完全正常
         List<String> ls = list;
         //但只要访问里面的元素，就会引发运行时异常
         System.out.println(ls.get(0));
     }
}
