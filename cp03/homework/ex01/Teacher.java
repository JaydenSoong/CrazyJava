package Teahcer;

/**
 * 作用：描述教师
 * @author jayden jiandongsong@126.com
 * @version 1.0
 */
public class Teacher{
    
    private String name;
    private int sex;

    /**
     * 教师的带参数构造方法
     * @param name, 教师姓名。
     * @param sex, 教师性别。
     */
    public Teacher(String name, int sex){
        this.name = name;
        this.age = age;
    }

    /**
     * 重写父类的 toString() 方法
     * @return 教师简介
     */
    @Override
    public String toString(){
        return "Thacher{name: " + this.name + "sex: " + this.sex + "}";
    }

    /**
     * 教师教学的方法
     */
    public void teach(){
        System.out.println("I'm going to teaching you......");
    }
}
