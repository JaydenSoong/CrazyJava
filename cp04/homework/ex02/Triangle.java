package classes;

/*
 * 输出等腰三角形如：
 *     
 *     *
 *    ***
 *   *****
 *  ******* 
 *
 *  分析：以上图形可以分成一行一行的考虑。每一行由空格和星号组成。
 *
 *  步骤：1、确定行数。（外层循环）。
 *        2、确定每一行空格的个数。
 *        3、确定每一行星号的个数。
 *        4、将空格和星号组合形成一行。
 *
 */
public class Triangle{
    
    public static void main(String[] args){
        printTriangle(7);
    }

    public static void printTriangle(int line){
        // 确定行数。（外层循环）。
        for(int i = 1; i <= line; i++){
            // 将空格和星号组合形成一行。
            System.out.println(getSpace(line, i) + getStar(i));
        }
    }

    // 确定每一行星号的个数。
    public static String getStar(int i){
        String star = ""; 
        for(int j = 1; j <= i * 2 - 1; j++){
            star += "*";
        }
        return star;
    }

    // 确定每一行空格的个数。
    public static String getSpace(int line, int i){
        String spa = ""; 
        for(int x = 0; x < line - i; x++){
            spa += " ";
        } 
        return spa;
    }
}
