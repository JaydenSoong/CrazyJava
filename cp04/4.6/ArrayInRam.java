package classes;

public class ArrayInRam{

    public static void main(String[] args){
        // 定义并初始化数组
        int[] a = {21, 34, 15};
        // 定义并初始化数组
        int[] b = new int[4];
        // 输出 b 数组的长度
        System.out.println(b.length);
        // 循环输出 a 数组的元素
        for(int i = 0, len = a.length; i < len; i++){
            System.out.println(a[i]);
        }
        // 循环输出 b 数组的元素
        for(int i = 0, len = b.length; i < len; i++){
            System.out.println(b[i]);
        }
        // 因为 a 是 int[] 类型，b 也是 int[] 类型。所以可以将 a 的值赋给 b
        b = a;
        // 再次输出 b 数组的长度
        System.out.println(b.length);
    }
}
