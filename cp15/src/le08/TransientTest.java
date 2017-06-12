package le08;

import java.io.*;

/**
 * Created by soong on 17-6-12.
 * 自定义序列化
 */
public class TransientTest {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.txt"))){
            Person per = new Person("孙悟空", 500);
            oos.writeObject(per);
            Person p = (Person) ois.readObject();
            //由于 Person 类的 age field 是用 transient 修饰过的，所以在序列化时会将其忽略，这里将输出 0。
            System.out.println(p.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
