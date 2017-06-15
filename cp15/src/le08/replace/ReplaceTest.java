package le08.replace;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by soong on 17-6-15.
 *
 */
public class ReplaceTest {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("replace.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("replace.txt"))) {
            Person per = new Person("孙悟空", 500);
            oos.writeObject(per);
            ArrayList list = (ArrayList) ois.readObject();
            System.out.println(list);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
