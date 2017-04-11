package classes;

public class PrimitiveArrayTest{

    public static void main(String[] args){
        // 定义一个数组
        int[] iArr;
        // 动态初始化
        iArr = new int[5];
        // 采用循环方式为每个数组元素赋值
        for(int i = 0; i < iArr.length; i++){
            iArr[i] = i + 10;
            System.out.println(iArr[i]);
        }
    }
}
