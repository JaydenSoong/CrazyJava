package classes;

class Ostrich extends Bird{
    @Override
    void fly(){
        System.out.println("我只能在大地上奔跑...");
    }

    public static void main(String[] args){
        // 创建 Ostrich 对象
        Ostrich os = new Ostrich();
        // 执行 覆盖后的方法
        os.fly();
    }
}
