package classes;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SeedTest {

    public static void main(String[] args) {
        
        Random r1 = new Random(50);
        System.out.println("第一个种子为 50 的 Random 对象");
        System.out.println("r1.nextBoolean():" + r1.nextBoolean());
        System.out.println("r1.nextInt():" + r1.nextInt());
        System.out.println("r1.nextDouble():" + r1.nextDouble());
        System.out.println("r1.nextGaussian():" + r1.nextGaussian());
        System.out.println("------------------------------");
        Random r2 = new Random(50);
        System.out.println("第二个种子为 50 的 Random 对象");
        System.out.println("r2.nextBoolean():" + r2.nextBoolean());
        System.out.println("r2.nextInt():" + r2.nextInt());
        System.out.println("r2.nextDouble():" + r2.nextDouble());
        System.out.println("r2.nextGaussian():" + r2.nextGaussian());
        System.out.println("------------------------------");
        Random r3 = new Random(150);
        System.out.println("种子为 150 的 Random 对象");
        System.out.println("r3.nextBoolean():" + r3.nextBoolean());
        System.out.println("r3.nextInt():" + r3.nextInt());
        System.out.println("r3.nextDouble():" + r3.nextDouble());
        System.out.println("r3.nextGaussian():" + r3.nextGaussian());
        System.out.println("------------------------------");
        Random r4 = new Random(System.currentTimeMillis());
        System.out.println("种子为当前时间的 Random 对象");
        System.out.println("r4.nextBoolean():" + r4.nextBoolean());
        System.out.println("r4.nextInt():" + r4.nextInt());
        System.out.println("r4.nextDouble():" + r4.nextDouble());
        System.out.println("r4.nextGaussian():" + r4.nextGaussian());
        System.out.println("------------------------------");
        System.out.println("ThreadLocalRandom 的用法");
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        System.out.println("tlr.nextBoolean():" + tlr.nextBoolean());
        System.out.println("tlr.nextInt():" + tlr.nextInt());
        
    }
}
