package classes;

public class StringBuilderTest {

    public static void main(String[] args) {
        // 创建一个字符容器
        StringBuilder sb = new StringBuilder();
        
        // 追加 java
        sb.append("java");

        // 插入 hello java
        sb.insert(0, "hello ");

        // 替换 hello,java
        sb.replace(5, 6, ",");

        // 删除 hellojava
        sb.delete(5, 6);

        System.out.println(sb);

        // 反转
        sb.reverse();

        System.out.println(sb);

        // 获取长度
        System.out.println(sb.length());

        // 获取容量
        System.out.println(sb.capacity());

        // 改变长度
        sb.setLength(5);

        System.out.println(sb);
    }
}
