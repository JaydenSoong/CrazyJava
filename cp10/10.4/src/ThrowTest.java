package classes;

public class ThrowTest {
    public static void main (String[] args) {
        try {
            // 调用声明 Checked 异常的方法，要么显示捕获该异常
            // 要么在main方法中再次声明抛出
            throwChecked(-3);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        throwRuntime(3);
    }

    public static void throwChecked(int a) throws Exception {
        if(a > 0) {
            // 自行抛出 Exception 异常
            // 该代码必须处于try块里，或处于带throws声明的方法里
            throw new Exception("a 的值大于 0, 不符合要求");
        }
    }

    public static void throwRuntime(int a) {
        if(a > 0) {
            // 自行抛出RuntimeException异常，既可以显示捕获该异常
            // 也可以完全不理会该异常，把该异常交给该方法的调用者处理
            throw new RuntimeException("a 的值大于 0, 不符合要求");
        }
    }
}
