package classes;


abstract class SpeedMeter {

    // 转速
    private double trunRate;

    public SpeedMeter() {}

    // 将获取半径设为抽象方法，由子类实现
    abstract double getRadius();

    // 设置转速
    void setTrunRate(double trunRate) {
        this.trunRate = trunRate;
    }

    // 获取速度
    double getSpeed() {
        return Math.PI * 2 * getRadius() * trunRate;
    }
}
