package classes;

public class ArrayTest{

    public static void main(String[] args){
        // 定义一个 int 数组类型的变量，变量名为 intArr
        int[] intArr;
        // 静态初始化
        intArr = new int[]{12, 45, 89, 1, 2};
        // 定义一个 Object 类型的变量，变量名为 objArr
        Object[] objArr;
        // 使用 Object 的子类来静态初始化
        objArr = new String[]{"java", "jayden"};
        // 定义一个 Object 类型的变量，变量名为 objArr2
        Object[] objArr2;
        // 使用 Object 类来静态初始化
        objArr2 = new Object[]{"java", "jayden"};
        // 实际开发中，采用下面的方式
        int[] a = {1, 3, 5, 7};

        // 数组的定义和初始化同时完成，使用动态初始化语法
        int[] prices = new int[4];
        // 数组的定义和初始化同时完成，初始化时元素的类型是定义数组的子类
        Object[] books = new String[3];

        // 输出 objArr 的第二个元素
        System.out.println(objArr[1]);
        // 为 objArr2 的第一个元素赋值
        objArr2[0] = "Spring";

        // 访问数组元素指定的索引值等于数组长度，所以将引发异常
        // System.out.println(objArr2[2]);

        // 使用循环来输出 prices 数组的每个元素的值
        for(int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

        // 对动态初始化后的数组元素进行赋值
        books[0] = "苏菲的世界";
        books[1] = "诗经";
        // 使用循环来输出 books 数组的每个元素的值
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
} 
