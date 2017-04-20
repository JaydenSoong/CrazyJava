package classes;

public class WrapperClassCompare{

    public static void main(String[] args){
        Integer a = new Integer(6);

        // 包装类实例和基本类型数值是可以比较的
        System.out.println("6 的包装类实例是否大于 5.0 " + (a > 5.0));

        // 两个包装类实例进行比较，指向同一个对象才为真
        Integer ina = 2;
        Integer inb = 2;
        System.out.println("比较两个由 2 自动装箱的包装类实例是否相等 " + 
                (ina == inb));
        System.out.println("比较两个包装类实例是否相等 " + 
                (new Integer(2) == new Integer(2)));

        Integer biga = 128;
        Integer bigb = 128;
        System.out.println("比较两个由 128 自动装箱的包装类实例是否相等 " + 
                (biga == bigb));
    }
}
