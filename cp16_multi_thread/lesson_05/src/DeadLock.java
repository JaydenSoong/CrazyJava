/**
 * Created by soong on 17-6-29.
 * 死锁演示
 */
public class DeadLock implements Runnable{
    private A a = new A();
    private B b = new B();

    private void init() {
        Thread.currentThread().setName("主线程");
        a.foo(b);
        System.out.println("进入了主线程之后");
    }

    public void run () {
        Thread.currentThread().setName("副线程");
        b.bar(a);
        System.out.println("进入了副线程之后");
    }

    public static void main(String[] args) {
        DeadLock d1 = new DeadLock();
        new Thread(d1).start();
        d1.init();
    }
}
