package classes;


public class CarSpeedMeter extends SpeedMeter {

    //  重写 SpeedMeter 的 getRadius 方法
    @Override
    double getRadius() {
        return .28;
    }

    public static void main(String[] args) {
        CarSpeedMeter csm = new CarSpeedMeter();
        csm.setTrunRate(15);
        System.out.println(csm.getSpeed());
    }
}
