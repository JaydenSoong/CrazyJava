package classes;

import java.lang.ref.*;

public class ReferenceTest {

    public static void main(String[] args) throws Exception {
        String str = new String("疯狂 Java 讲义");
        WeakReference wr = new WeakReference(str);
        str = null;
        System.out.println(wr.get());
        System.gc();
        System.runFinalization();
        System.out.println(wr.get());
    }
}
