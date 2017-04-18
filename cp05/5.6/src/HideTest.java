package classes;


class Parent{
    String tag = "疯狂 Java 讲义";
}


class Derived extends Parent{
    private String tag = "第一行代码";
}


public class HideTest{
    
    public static void main(String[] args){
        // 创建子类对象
        Derived d = new Derived();
        // 下面的语句将出错，权限不对
        // System.out.println(d.tag);
        // 向上转型
        System.out.println(((Parent)d).tag);
    }
}
