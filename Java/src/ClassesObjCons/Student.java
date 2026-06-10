package ClassesObjCons;

/**
 * Agenda:
 * 1. Constructor
 * 2. Parameterised Constructor (Best)
 * 3. Copy Constructor
 * 4. Object Life Cycle
 */

public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default Constructor // attr. -> garbage
    public Student() {
        System.out.println("Student Default Constructor Called");
    }

    // Parameterised Constructor
    public Student(int id, int age, String name, int nos) {
        System.out.println("Student Parameterised Constructor Called");

        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Copy Constructor
    public Student(Student srcObj) { // srcObj -> A
        System.out.println("Student Copy Constructor Called");

        this.id = srcObj.id;
        this.age = srcObj.age;
        this.name = srcObj.name;
        this.nos = srcObj.nos;
    }

    // Methods/ Behaviours
    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(name + " Sleeping");
    }

    public void bunk() {
        System.out.println(name + " Bunking");
    }
}
