/**
 * Created by soong on 17-6-20.
 * 后台线程
 */
public class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        DaemonThread dt = new DaemonThread();
        //将此线程设置成后台线程
        dt.setDaemon(true);
        //启动后台线程
        dt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        //------执行程序到此处，前台线程（main 线程）结束------
        //后台线程也应该随之结束
    }
}
