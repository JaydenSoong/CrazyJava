package classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ErrorUtils {
    public static void faultyMethod(List<String>... listStrArray) {
        //Java语言不允许创建数组，因此listStrArray只能被当成List[]处理
        //此时，相当于把List<String>赋给了List，已经发生了“堆污染”
        List[] listArray = listStrArray;
        List<Integer> myList = new ArrayList<>();
        myList.add(new Random().nextInt(100));
        listArray[0] = myList;
        String s = listStrArray[0].get(0);
    }
} 
