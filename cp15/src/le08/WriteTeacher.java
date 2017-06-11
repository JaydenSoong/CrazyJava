package le08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by soong on 17-6-11.
 * 多次序列化同一个对象
 */
public class WriteTeacher {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"))) {
            Person p = new Person("孙悟空", 500);
            Teacher t1 = new Teacher("菩提祖师", p);
            Teacher t2 = new Teacher("唐僧", p);
            oos.writeObject(t1);
            oos.writeObject(t2);
            oos.writeObject(p);
            oos.writeObject(t2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
