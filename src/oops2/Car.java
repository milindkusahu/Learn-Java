package oops2;

public class Car extends Vehicle {

    String color;

//    void accelerate() {
//        'accelerate()' cannot override 'accelerate()' in 'oops2.Vehicle'; overridden method is final
//    }

    void start() {
        super.start();
        System.out.println(this); // tells which object has called this function start()
        System.out.println(this.model + ", Car is starting");
    }

    Car() { // constructor
        super(3);
        System.out.println("Car is being created");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.wheelsCount);
        obj.wheelsCount = 4;
        obj.model = "Grand Vitara";
        obj.color = "White";
        obj.start();
        System.out.println(obj.wheelsCount);
    }
}
