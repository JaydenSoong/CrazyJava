/**
 * Created by soong on 17-6-19.
 * 实现 Runnable 接口，使用 Lambda 表达式创建线程类
 */
public class SecondThreadUseLambda{
    private static int j;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            if (i == 20) {

                //通过 new Thread(target, name) 方法创建新线程
                new Thread(()-> {
                    for (; j < 100; j++) {
                        System.out.println(Thread.currentThread().getName() + " " + j);
                    }
                }, "新线程").start();
            }
        }
    }
}
