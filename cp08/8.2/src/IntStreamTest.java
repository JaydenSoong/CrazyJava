package classes;

import java.util.stream.IntStream;

public class IntStreamTest {

    public static void main(String[] args) {
        IntStream is = IntStream.builder()
            .add(25)
            .add(32)
            .add(9)
            .add(0)
            .add(1)
            .add(-1)
            .add(3)
            .build();

        // 下面调用聚集方法的代码每次只能执行一行
        // System.out.println("is 所有元素的最大值：" + is.max().getAsInt());
        // System.out.println("is 所有元素的最大值：" + is.min().getAsInt());
        // System.out.println("is 所有元素的总和：" + is.sum());
        // System.out.println("is 所有元素的总数：" + is.count());
        // System.out.println("is 所有元素的平均值：" + is.average().getAsDouble());
        // System.out.println("is 所有元素的平方是否都大于 20：" + is.allMatch(ele -> ele * ele > 20));
        // System.out.println("is 是否包含任何元素平方大于 20：" + is.anyMatch(ele -> ele * ele > 20));
        
        // 将 is 映射成一个新的 Stream，新 Stream 的每个元素都是原 Stream 元素的 2 倍加 1。 
        IntStream newIs = is.map(ele -> ele * 2 + 1);
        // 使用方法引用的方式来遍历集合元素。
        newIs.forEach(System.out :: println);
    }
}
