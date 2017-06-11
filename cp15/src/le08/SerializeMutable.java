package le08;

import java.io.*;

/**
 * Created by soong on 17-6-11.
 * 当程序序列化一个可变对象时，只有第一次使用writeObject()方法时，
 * 才会将该对象转换成字节序列并输出。当程序再次调用writeObject()
 * 方法时，程序只是输出前面的序列化编号
 */
public class SerializeMutable {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mutable.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mutable.txt"))) {
            Person p = new Person("孙悟空", 500);
            //第一次序列化
            oos.writeObject(p);
            p.setName("猪八戒");
            //第二次序列化，只是输出编号，而不管对象是否变动
            oos.writeObject(p);
            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();
            System.out.println(p1 == p2);
            System.out.println(p2.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
