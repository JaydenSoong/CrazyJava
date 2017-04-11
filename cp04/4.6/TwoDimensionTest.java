package classes;

public class TwoDimensionTest{

    public static void main(String[] args){
        // 定义一个二维数组
        int[][] a;
        // 把 a 当成一个一维数组进行初始化，初始化 a 是一个长度为 4 的数组。
        // a 数组的元素又是引用类型
        a = new int[4][];
        // 把 a 数组当成一个一维数组，遍历 a 数组的每个数组元素
        for(int i = 0, len = a.length; i < len; i++){
            System.out.println(a[i]);
        }
        // 初始化 a 数组的第一个元素
        a[0] = new int[2];
        // 访问 a 数组的第一个元素所指的第二个元素
        a[0][1] = 6;
        // a 数组的第一个元素是一个一维数组。遍历这个数组
        for(int i = 0, len = a[0].length; i < len; i++){
            System.out.println(a[0][i]);
        }

        // 同时初始化二维数组的两个维数
        int[][] b = new int[2][5];

        // 使用静态初始化来初始化一个二维数组
        String[][] str1 = new String[][]{new String[3], new String[]{"Hello"}};
        // 使用简化的静态初始化来初始化一个二维数组
        String[][] str2 = {new String[3], new String[]{"Hello"}};

    }
}
