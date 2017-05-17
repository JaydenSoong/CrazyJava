package classes;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main (String[] args) {
        // Comparator 的实际类型是 TreeSet 的元素的父类型，满足要求
        TreeSet<String> ts1 = new TreeSet<>(new Comparator<Object>(){
            public int compare(Object fst, Object snd) {
                return fst.hashCode() > snd.hashCode() ? 1
                    : fst.hashCode() < snd.hashCode() ? -1 : 0;
            }
        });    
        ts1.add("Hello");
        ts1.add("wa");

        // Comparator 的实际类型是 TreeSet 的元素类型，满足要求
        TreeSet<String> ts2 = new TreeSet<>(new Comparator<String>(){
            public int compare(String fst, String snd) {
                return fst.length() > snd.length() ? 1
                    : fst.length() < snd.length() ? -1 : 0;
            }
        });    
        ts2.add("Hello");
        ts2.add("wa");
        
        System.out.println(ts1);
        System.out.println(ts2);
    }
}
