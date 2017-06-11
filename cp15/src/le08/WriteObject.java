package le08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by soong on 17-6-11.
 * 将对象保存到文件中
 */
public class WriteObject {
    public static void main(String[] args) {
        try (//创建一个ObjectOutputStream输出流
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Object.txt"))) {
            Person p = new Person("张三", 32);
            //将Person对象写入输出流中
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
