package le03;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by soong on 17-6-9.
 * FileWriter 测试
 */
public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("poem.txt")) {
            fw.write("锦瑟——李商隐\n");
            fw.write("锦瑟无端五十弦，一弦一柱思华年。\n");
            fw.write("庄生晓梦迷蝴蝶，望帝春心托杜鹃。\n");
            fw.write("沧海月明珠有泪，蓝田日暖玉生烟。\n");
            fw.write("此情可待成追忆？只是当时已惘然。\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
