package oops2;

public class Vehicle {

    final int gears = 4; // once defined the value can't be changed

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
//        v1.gears = 6;
    }

    int wheelsCount;

    String model;

    Vehicle() {
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }

    void start() {
        System.out.println("Vehicle is Starting");
    }

    final void accelerate() { // this method can be override
        System.out.println("Vehicle is accelerating");
    }
}
