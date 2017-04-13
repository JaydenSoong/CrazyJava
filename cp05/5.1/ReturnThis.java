package classes;

public class ReturnThis{

    // 定义成员变量
    public int age;

    public ReturnThis grow(){
        age++;
        // 返回调用该方法的对象
        return this;
    }

    public static void main(String[] args){
        
        ReturnThis rt = new ReturnThis();
        
        rt.grow().grow().grow();

        System.out.println("对象 rt 的成员变量 age 的值是：" + rt.age);
    }
}
