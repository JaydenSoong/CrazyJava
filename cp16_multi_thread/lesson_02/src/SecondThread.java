/**
 * Created by soong on 17-6-19.
 * 实现 Runnable 接口创建线程类
 */
public class SecondThread implements Runnable {
    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            // 当线程类实现 Runnable 接口时，如果想获取当前线程，只能使用 Thread.currentThread() 方法
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            if (i == 20) {
                SecondThread st = new SecondThread();
                //通过 new Thread(target, name) 方法创建新线程
                new Thread(st, "新线程1").start();
                new Thread(st, "新线程2").start();
            }
        }
    }
}
