package Inheritance;

/**
 * -> Unlike C++, Java doesn't provide an Inheritance specifier like public, protected, or private, i.e., you can not specify mode of inheritance.
 * -> Java does not support multiple inheritance.
 */
public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    public Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine() {
        System.out.printf("Engine is starting of %s : %s\n", name, model);
    }

    void stopEngine() {
        System.out.printf("Engine is stopping of %s : %s\n", name, model);
    }
}
