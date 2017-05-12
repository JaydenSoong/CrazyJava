package classes;

import java.util.TreeMap;

class R implements Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    public String toString() {
        return "R[count:" + count + "]";
    }

    // 根据 count 值判断相等
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(o != null && o.getClass() == R.class) {
            return true;
        }

        return false;
    }

    // 重写 compareTo()
    public int compareTo(Object e) {
        R r = (R) e;
        return this.count > r.count ? 1 : this.count < r.count ? -1 : 0;
    }
}


public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(new R(3), "西游记");
        map.put(new R(-5), "王阳明全集");
        map.put(new R(9), "平凡的世界");
        System.out.println(map);
        // 返加 map 中的第一个条目
        System.out.println(map.firstEntry());
        // 返回 map 中的最后一个条目
        System.out.println(map.lastEntry());
        // 返回 map 中比 new R(2) 大的最小 key 值
        System.out.println(map.higherKey(new R(2)));
        // 返回 map 中比 new R(-1) 小的最大条目 
        System.out.println(map.lowerEntry(new R(-1)));
        // 子 Map，从 R(-1) 到 R(4)
        System.out.println(map.subMap(new R(-1), new R(4)));
    }
}
