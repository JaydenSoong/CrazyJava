/**
 * Created by soong on 17-6-20.
 * 直接调用 run() 方法
 */
public class InvokeRun extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            if (i == 20) {
                /*
                 * 直接调用线程对象的 run() 方法，系统会把线程对象当成普通对象，把 run() 方法
                 * 当成普通方法，所以下面两行代码不会启动两个线程，而是依次执行两个 run() 方法
                 */
                new InvokeRun().run();
                new InvokeRun().run();
            }
        }
    }
}
