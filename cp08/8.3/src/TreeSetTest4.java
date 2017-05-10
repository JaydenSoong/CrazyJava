package classes;

import java.util.TreeSet;

class M {
    int age;
    
    public M(int age) {
        this.age = age;
    }

    public String toString(){
        return "M[age:" + age + "]";
    }
}

public class TreeSetTest4 {

    public static void main(String[] args) {
        // 此处 Lambda 表达式的目标类型是 Comparator
        TreeSet ts = new TreeSet((o1,o2) ->{
            M m1 = (M)o1;
            M m2 = (M)o2;
            // 根据 M 对象的 age 来决定大小，从大到小排序 
            return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;
        });

        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);
    }

}
