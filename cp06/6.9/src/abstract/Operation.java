package abs;

public enum Operation {
    PLUS {
        public double eval(double x, double y) {
            return x + y;
        }
    }, 
    MINUS {
        public double eval(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        public double eval(double x, double y) {
            return x * y;
        }
    }, 
    DEVIDE {
        public double eval(double x, double y) {
            return x / y;
        }
    };

    //  为这个枚举类提供抽象方法，
    //  这信抽象方法由不同枚举值提供不同实现
    public abstract double eval(double x, double y);

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(3, 5));
        System.out.println(Operation.MINUS.eval(3, 5));
        System.out.println(Operation.TIMES.eval(3, 5));
        System.out.println(Operation.DEVIDE.eval(3, 5));
    }
}
