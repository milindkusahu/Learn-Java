package Inheritance;

public class Main {
    static void main() {
//        Car c = new Car("Maruti", "800", 4, 5, "Auto");
//        c.startEngine();
//        c.startAC();
//        c.stopEngine();

        MotorCycle m = new MotorCycle("Splender", "Xline", 2, "U", "Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
