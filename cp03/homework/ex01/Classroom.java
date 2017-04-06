package Classroom;

/**
 * 描述教室
 * @author jayden jiandongsong@126.com
 * @version 1.0
 */

public class Classroom{

    //教室的座位数
    private int size;
    //教室位置
    private String local;

    /**
     * 不带参数的构造方法
     */
    public Classroom(){
    }

    /**
     * 带两个参数的构造方法
     * @param size, 教室座位数
     * @param local, 教室位置
     */
    public Classroom(int size, String local){
        this.size = size;
        this.local = local;
    }

    /**
     * 重写父类的 toString() 方法
     * @return 教室概况
     */
    @Override
    public String toString(){
        return "座位数：" + this.size + "教室位置：" + this.local; 
    }
}
