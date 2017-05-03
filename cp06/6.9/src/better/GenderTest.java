package better;

public class GenderTest {
    public static void main(String[] args) {
        Gender g = Gender.valueOf("FEMALE");
        g.setName("女");
        System.out.println(g + "代表：" + g.getName());
        // 将提示参数错误, 不能设置成功
        g.setName("男");
        System.out.println(g + "代表：" + g.getName());
    }
}
