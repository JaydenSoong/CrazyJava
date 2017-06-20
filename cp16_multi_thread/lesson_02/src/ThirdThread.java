import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by soong on 17-6-20.
 * 使用 Callable 和 Future 创建线程
 */
public class ThirdThread {
    public static void main(String[] args) {
        /*
         * 先使用 Lambda 表达式来创建 Callable 对象
         * 使用 FutureTask 来包装 Callable 对象
         */
        FutureTask<Integer> task = new FutureTask<>(() -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "的循环变量 i 的值： " + i);
            }
            return i;
        });

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " 的循环变量 i 的值： " + i);

            if (i == 20) {
                new Thread(task, "有返回值的线程").start();
            }
        }

        try {
            //获取线程返回值
            System.out.println("子线程的返回值: " + task.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
