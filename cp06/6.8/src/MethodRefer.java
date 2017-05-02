package classes;

@FunctionalInterface
interface Converter {
    Integer convert(String from);
}


public class MethodRefer {
    
    public static void main(String[] args) {
        // 下面代码使用 Lambda 表达式创建 Converter 对象
        Converter converter1 = from -> Integer.valueOf(from);

        // 方法引用代替 Lambda 表达式：引用类方法
        // 函数式接口中被实现方法的全部参数传给该类方法作为参数
        Converter converter2 = Integer :: valueOf;

        System.out.println(converter1.convert("99"));
        System.out.println(converter2.convert("98"));
    }
}
