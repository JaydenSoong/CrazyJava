package classes;

import java.util.TreeSet;

class R implements Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    public String toString() {
        return "R[count:" + count + "]";
    }

    // 重写 equals 方法，根据 count 来判断是否相等
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(o != null && o.getClass() == R.class) {
            R r = (R) o;
            return count == r.count;
        }

        return false;
    }

    // 重写 compareTo 方法，根据 count 来比较大小
    public int compareTo(Object o) {
        R r = (R) o;
        return count > r.count ? 1 : count < r.count ? -1 : 0; 
    }
}

public class TreeSetTest3 {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new R(5));
        ts.add(new R(-3));
        ts.add(new R(9));
        ts.add(new R(-2));
        // 打印 TreeSet 集合元素，集合元素是有序排列的。
        // [R[count:-3], R[count:-2], R[count:5], R[count:9]]
        System.out.println(ts);
        // 取出第一个元素
        R first = (R) ts.first();
        // 对第一个元素的 count 赋值
        first.count = 20;
        // 取出最后一个元素
        R last = (R) ts.last();
        // 对最后一个元素赋值
        last.count = -2; 
        // 打印 TreeSet 集合元素，集合元素处于无序状态，且有重复元素。
        // [R[count:20], R[count:-2], R[count:5], R[count:-2]]
        System.out.println(ts);
        // 删除实例变量被改变的元素，删除失败
        System.out.println(ts.remove(new R(-2)));
        System.out.println(ts);
        // 删除实例变量被改变的元素，删除成功
        System.out.println(ts.remove(new R(5)));
        // [R[count:20], R[count:-2], R[count:-2]]
        System.out.println(ts);
    }
}
