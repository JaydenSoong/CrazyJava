package classes;

public class EnhanceAssign{

    public static void main(String[] args){
        byte a = 5; 
        
        // 下面的表达式将出错，因为 a + 5 自动提升为 int 类型，int 类型不能直接赋值给 byte 类型
        // 错误: 不兼容的类型: 从int转换到byte可能会有损失
        // a = a + 5;

        byte b = 4; 

        // 下面的表达式将不会出错
        b += 4;
    }
}
