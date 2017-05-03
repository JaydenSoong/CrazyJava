package inter;

public enum Gender implements GenderDesc {
    // 此处的枚举值必须调用相应的构造器来创建
    // 这里的花括号实际上是类体部分
    MALE("男") {
        public void info() {
            System.out.println("这个枚举值代表男性");
        }
    }, 
    
    FEMALE("女") {
        public void info() {
            System.out.println("这个枚举值代表女性");
        }
    };
    
    private final String name;

    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("这是一个用于定义性别的枚举类");
    }
}
