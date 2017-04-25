package classes;


class Triangle extends Shape {
    // 定义三角形三边
    private double a, b, c;

    Triangle(String color, double a , double b, double c) {
        super(color);
        this.setSides(a, b, c);
    }

    private void setSides(double a, double b, double c) {

        if(a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("三角形的两边之和必须大于第三边");
            return;
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    // 重写 Shape 类的计算周长的方法
    double calPerimeter() {
        return a + b + c;
    }

    // 重写 Shape 类的返回形状的方法
    String getType() {
        return "三角形";
    }
}
