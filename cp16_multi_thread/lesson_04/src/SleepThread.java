import java.util.Date;

/**
 * Created by soong on 17-6-20.
 * 线程睡眠
 */
public class SleepThread {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前时间：" + new Date());
            //调用静态方法 sleep(), 让当前线程暂停 1s
            Thread.sleep(1000);
        }
    }
}
