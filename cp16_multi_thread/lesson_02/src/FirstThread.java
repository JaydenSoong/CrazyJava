/**
 * Created by soong on 17-6-19.
 * 继承 Thread 类创建线程
 */
public class FirstThread extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            /*
             * 当线程类继承 Thread 类时，直接使用 this 即可获取当前线程
             * Thread 对象的 getName() 返回当前线程名字
             * 因此可以直接调用 getName() 方法返回当前线程的名字
             */
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //调用 Thread 类的静态方法 currentThread() 返回当前线程
            System.out.println(Thread.currentThread().getName() + " " + i);

            if (i == 20) {
                //创建并启动第一个线程
                new FirstThread().start();
                //创建并启动第二个线程
                new FirstThread().start();
            }
        }
    }
}
