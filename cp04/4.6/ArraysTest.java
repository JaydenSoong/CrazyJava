package classes;

import java.util.Arrays;

public class ArraysTest{

    public static void main(String[] args){
        // 定义一个数组 a
        int[] a = new int[]{3, 4, 5, 6};
        // 定义一个数组 a2
        int[] a2 = new int[]{3, 4, 5, 6};

        // 判断 a 是否等于 a2 
        System.out.println("a 数组和 a2 数组是否相等：" + Arrays.equals(a, a2));

        // 通过复制 a 数组，生成一个新的数组
        int[] b = Arrays.copyOf(a, 6);

        // 判断 a 是否等于 b 
        System.out.println("a 数组和 b 数组是否相等：" + Arrays.equals(a, b));

        // 输出 b 数组的元素
        System.out.println("b 数组的元素为：" + Arrays.toString(b));

        // 将 b 数组和第 3 个元素（包括）到第 5 个元素（不包括）赋值为 1
        Arrays.fill(b, 2, 4, 1);

        // 输出 b 数组的元素
        System.out.println("b 数组的元素为：" + Arrays.toString(b));

        // 对 b 数组进行排序
        Arrays.sort(b);
        
        // 输出 b 数组的元素
        System.out.println("b 数组的元素为：" + Arrays.toString(b));
    }
}
