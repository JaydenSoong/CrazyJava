package classes;

public class GenderTest {
    public static void main(String[] args) {
        // 通过 EnumClass.variable 的方式来访问实例
        Gender g = Gender.FEMALE;
        // 通过 Enum 的 valueOf() 方法来获取实例值
        g = Enum.valueOf(Gender.class, "FEMALE");
        // 直接为枚举值的 name 实例变量赋值
        g.name = "女";

        // 直接访问枚举值的 name 实例变量
        System.out.println(g + "代表：" + g.name);
    }
}
