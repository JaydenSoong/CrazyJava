package classes;

// 使用 import static 导包之后，连类名都不用写了
import static java.lang.System.*;
import static java.lang.Math.*;

public class StaticImportTest{
    public static void main(String[] args){
        out.println(PI);
        out.println(sqrt(256));
    }
}
