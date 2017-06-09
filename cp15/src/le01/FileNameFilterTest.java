package le01;

import java.io.File;

/**
 * Created by soong on 17-6-9.
 * 文件过滤器
 */
public class FileNameFilterTest {
    public static void main(String[] args) {
        File file = new File(".");
        //FilenameFilter 是一个函数式接口
        //使用Lambda表达式列出java类型的文件和目录
        String[] nameList = file.list((dir, name) ->
                name.endsWith(".java") || new File(name).isDirectory());
        if (nameList != null) {
            for (String name : nameList) {
                System.out.println(name);
            }
        }
    }
}
