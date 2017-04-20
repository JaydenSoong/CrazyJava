package classes;

public class AutoBoxingUnboxing{

    public static void main(String[] args){
        // 直接把一个基本类型的变量赋给 Integer 对象
        Integer ina = 6;
        // 直接把一个布尔型的变量赋值给 Object 对象
        Object boolObj = true;
        
        // 直接把一个 Integer 对象赋值给 int 类型的变量
        int it = ina;

        if(boolObj instanceof Boolean){
            // 先把 Object 对象强转为 Boolean 类型，再赋给 boolean 变量
            boolean b = (Boolean) boolObj;
            System.out.println(b);
        }
    }
}
