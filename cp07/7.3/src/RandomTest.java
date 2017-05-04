package classes;

import java.util.Random;
import java.util.Arrays;

public class RandomTest {

    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println("rd.nextBoolean():" + rd.nextBoolean());

        byte[] buffer = new byte[16];
        // 生成一个长度固定的 byte 数组
        rd.nextBytes(buffer);
        System.out.println("rd.nextBytes():" + Arrays.toString(buffer));
        
        // 生成一个 0.0 ~ 1.0 之间的随机 Double 数
        System.out.println("rd.nextDouble():" + rd.nextDouble());

        // 生成一个 0.0 ~ 1.0 之间的随机 Float 数
        System.out.println("rd.nextFloat():" + rd.nextFloat());
        
        // 生成平均值是 0.0，标准差是 1.0 的伪高斯数
        System.out.println("rd.nextGaussian():" + rd.nextGaussian());

        // 生成一个 int 型的整数
        System.out.println("rd.nextInt():" + rd.nextInt());

        // 生成一个小于 10 的整数
        System.out.println("rd.nextInt(10):" + rd.nextInt(10));

        // 生成一个 long 的整数
        System.out.println("rd.nextLong():" + rd.nextLong());
    }
}
