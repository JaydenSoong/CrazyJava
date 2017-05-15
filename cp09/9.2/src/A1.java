package classes;

/**
 * 如果从 Apple<String> 类派生子类，则在 Apple 中所有使用 T 类型形参的地方
 * 都将被替换成 String 类型
 */
public class A1 extends Apple<String> {
    /**
     * 正确重写父类方法，返回值。
     * 与父类 Apple<String> 的返回值完全相同
     */
    public String getInfo() {
        return "子类" + super.getInfo(); 
    }

    /*
     // 下面的方法是错误的，重写父类方法时，返回值类型与父类不一致
     public Object getInfo() {
        return "子类";
     }
    */
}
