package classes;

public class ConversionTest{
    
    public static void main(String[] args){
        conversionTest(); 
    }

    public static void conversionTest(){

        byte bVal = 8;
        short sVal;
        int iVal;
        long lVal;
        float fVal;
        double dVal;

        // 低位到高位的自动转换
        dVal = fVal = lVal = iVal = sVal = bVal;
        show(bVal, sVal, iVal, lVal, fVal, dVal);

        // 高位到低位的强制转换(要考虑低位的取值范围)
        dVal = 127.0;
        fVal = (float) dVal;
        lVal = (long) fVal;
        iVal = (int) lVal;
        sVal = (short) iVal;
        bVal = (byte) sVal;
        show(bVal, sVal, iVal, lVal, fVal, dVal);
    }

    public static void show(byte bVal, short sVal, int iVal, long lVal, float fVal, double dVal){
        System.out.println("bVal = " + bVal);
        System.out.println("sVal = " + sVal);
        System.out.println("iVal = " + iVal);
        System.out.println("lVal = " + lVal);
        System.out.println("fVal = " + fVal);
        System.out.println("dVal = " + dVal);
        System.out.println("-------end-------");
    }
}
