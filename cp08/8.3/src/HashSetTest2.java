package classes;

import java.util.HashSet;
import java.util.Iterator;

class R {
    
    int count;

    public R(int count) {
        this.count = count;
    }

    public String toString() {
        return "R[count:" + count + "]";
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj != null && obj.getClass() == R.class) {
            R r = (R) obj;
            return this.count == r.count;
        }
        return false;
    }

    public int hashCode() {
        return this.count;
    }
}


public class HashSetTest2 {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));
        // 打印 HashSet 集合，集合元素没有重复
        System.out.println(hs);
        // 取出第一个元素
        Iterator it = hs.iterator();
        R first = (R) it.next();
        // 为第一个元素的 count 实例变量赋值
        first.count = -3;
        // 再次输出集合元素，集合有重复元素
        System.out.println(hs);
        // 删除 count 为 -3 的 R 对象
        hs.remove(new R(-3));
        // 可以看到被删除了一个 R 元素
        System.out.println(hs);
        System.out.println("hs 是否包含 count 为 -3 的 R 对象？" + hs.contains(new R(-3)));
        System.out.println("hs 是否包含 count 为 -2 的 R 对象？" + hs.contains(new R(-2)));
    }
}
