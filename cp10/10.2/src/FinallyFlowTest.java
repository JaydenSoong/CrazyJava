package classes;

public class FinallyFlowTest {

    public static void main (String[] args) {
        System.out.println(test());
    }

    static boolean test() {
        try {
            // 因为 finally 块中包含了 return 语句，所以下面语句失去作用
            return true;
        } finally {
            return false;
        }
    }
}
