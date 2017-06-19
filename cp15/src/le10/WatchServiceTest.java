package le10;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by soong on 17-6-19.
 * 监控文件变化
 */
public class WatchServiceTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        //获取文件系统的 WatchService 对象
        WatchService watchService = FileSystems.getDefault().newWatchService();
        //为当前目录注册监听
        Paths.get(".").register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        while (true) {
            //获取下一个文件变化事件
            WatchKey key = watchService.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println(event.context() + " 文件发生了 " + event.kind() + "事件！");
            }
            //重设 WatchKey
            boolean valid = key.reset();
            //若重设失败，退出监听
            if (!valid) {
                break;
            }
        }
    }
}
