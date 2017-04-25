package classes;


class CacheImmutable {

    // 定义缓存数组长度
    private static final int MAX_SIZE = 10;
    // 定义缓存数组
    private static CacheImmutable[] cache = new CacheImmutable[MAX_SIZE];
    // 记录实例在数组中的位置
    private static int pos = 0;
    // 实例的不可变（成员变量用 private 和 final 修饰）
    private final String name;

    // 带参构造器，隐藏起来，类以外不可以 new 实例
    private CacheImmutable(String name) {
        this.name = name;
    }

    private String getName(){
        return name;
    }

    // 对外提供获取实例的方法
    static CacheImmutable valueOf(String name) {

        // 当缓存数组里有与 name 相同的元素，则返回该元素
        for(int i = 0; i < MAX_SIZE; i++) {
            if(cache[i] != null && cache[i].getName().equals(name)) {
                return cache[i];
            }
        }

        // 若缓存池已满，则从头开始存储
        if(pos == MAX_SIZE) {
            cache[0] = new CacheImmutable(name);
            pos = 1;
        } else {
            // 若缓存池未满，则顺次存储在下一个位置
            cache[pos++] = new CacheImmutable(name);
        }

        // 返回实例
        return cache[pos - 1];
    }

    // 重写 equals 方法
    public boolean equals(Object obj){

        if(this == obj) {
            return true;
        }

        if(obj != null && obj.getClass() == CacheImmutable.class) {
            CacheImmutable ci = (CacheImmutable) obj;
            return name.equals(ci.getName());
        }

        return false;
    }

    // 重写 hashCode 方法
    public int hashCode(){

        return name.hashCode();
    }
}


public class CacheImmutableTest {

    public static void main(String[] args) {
        CacheImmutable c1 = CacheImmutable.valueOf("hello");
        CacheImmutable c2 = CacheImmutable.valueOf("hello");
        System.out.println(c1 == c2);
    }
}
