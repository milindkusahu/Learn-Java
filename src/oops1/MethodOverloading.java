package oops1;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings("Milind", 5);
    }
}

class Greet {
    void greetings() {
        System.out.println("Hello, Good Morning");
    }

    void greetings(String name) {
        System.out.println("Hello " + name + ", Good Morning");
    }

    void greetings(String name, int count) {
        for (int i=0; i<count; i++) {
            System.out.println("Hello " + name + ", Good Morning");
        }
    }
}