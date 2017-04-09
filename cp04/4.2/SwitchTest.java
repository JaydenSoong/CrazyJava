package classes;

public class SwitchTest{

    public static void main(String[] args){
        // 声明变量 score，并赋值
        char score = 'C';

        // 执行 swith 分枝语句
        switch(score){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("中");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("不及格");
                break;
            default:
                System.out.println("成绩录入错误");
        }
    }
}
