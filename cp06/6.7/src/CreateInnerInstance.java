package classes;


class Out {

    class In {

        public In(String msg) {
            System.out.println(msg);
        }
    }
}


public class CreateInnerInstance {

    public static void main(String[] args) {
        Out.In in = new Out().new In("测试信息");
        /*
         * 上面的代码，可以改为如下三行
         * 
         * 使用 OuterClass.InnerClass 的形式定义内部类变量
         * Out.In in;
         * 创建外部类实例，内部类实例将寄生在外部类实例中
         * Out out = new Out();
         * 通过外部类实例和 new 关键字来调用内部类构造器来创建内部类实例
         * in = out.new In("测试信息");
         */
    }
}
