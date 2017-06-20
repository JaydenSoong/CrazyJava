/**
 * Created by soong on 17-6-20.
 * 线程死亡
 */
public class StartDead extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        //创建线程对象
        StartDead st = new StartDead();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            if (i == 20) {
                //启动线程
                st.start();
                //判断启动后线程对象的 isAlive() 值，输出 true
                System.out.println(st.isAlive());
            }

            /*
             * 当线程处于新建、死亡两种状态时，isAlive() 方法将返回 false
             */
            if (i > 20 && !st.isAlive()) {
                //试图再次启动该线程，将引发异常 IllegalThreadStateException
                st.start();
            }
        }
    }
}
