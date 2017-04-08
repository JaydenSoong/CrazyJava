package classes;

public class AssignTest{
    
    public static void main(String[] args){
        assigntest();
    }

    public static void assigntest(){

        // 声明 8 种数据类型
        byte bValue;
        short sValue;
        char cValue;
        int iValue, iVal;
        long lValue;
        float fValue;
        double dValue, dVal;
        boolean boValue;

        // 简单赋值
        bValue = 3;
        sValue = 3;
        cValue = 'a';
        iValue = 97;
        lValue = 97L;
        fValue = 97.0f;
        dValue = 97.0;
        boValue = false;

        // 连续赋值
        iVal = iValue = 98;

        // 表达式赋值
        dVal = dValue + 32;
    }
}
