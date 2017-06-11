package le08;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by soong on 17-6-11.
 * 从文件中读取对象
 */
public class ReadObject {
    public static void main(String[] args) {
        try (//创建一个ObjectInputStream输入流
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.txt"))) {
            //从输入流中读取一个Object对象，并将其强制转换成Person类
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
