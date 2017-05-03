package best; 

public enum Gender {
    // 列出枚举值时必须调用相应的构造器
    MALE("男"), FEMALE("女");
    private final String name;
    // 枚举类的构造器只能使用 private 修饰
    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
