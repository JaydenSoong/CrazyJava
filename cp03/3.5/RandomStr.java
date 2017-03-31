package classes;

/**
 * 生成一个随机的 6 位字母字符串
 */
public class RandomStr{

    public static void main(String[] args){
        
        // 新建一个 StringBuilder 对象
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 6; i ++){
            // 生成一个值在 97--122 之间的 char 类型数据，并将其添加到可变字符序列 sb
            sb.append((char) (Math.random() * 26 + 97));
        }

        System.out.println(sb);
    }
}
