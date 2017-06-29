/**
 * Created by soong on 17-6-29.
 * 死锁演示
 */
public class A {
    synchronized void foo(B b) {
        System.out.println("当前线程名：" + Thread.currentThread().getName() + "进入了A实例的foo()方法");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名：" + Thread.currentThread().getName() + "企图调用B实例的last()方法");
    }

    public synchronized void last() {
        System.out.println("进入了A类的last()方法内部");
    }
}
