/**
 * Created by soong on 17-6-20.
 * join 线程
 */
public class JoinThread extends Thread {

    //提供一个有参数的构造器，用于设置该线程的名字
    private JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //启动子线程
        new JoinThread("新线程").start();

        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                JoinThread jt = new JoinThread("被 Join 的线程");
                jt.start();
                //main 线程调用了 jt 线程的 join() 方法，main 线程必须等 jt 线程结束才会向下执行
                jt.join();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
