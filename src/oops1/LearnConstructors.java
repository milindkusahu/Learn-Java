package oops1;

public class LearnConstructors {
    public static void main(String[] args) {
        NewComplex num1 = new NewComplex(2, 4);
        NewComplex num2 = new NewComplex(4,1);
        num1.print();
        num2.print();
        System.out.println("Adding two numbers");
        NewComplex result = num1.add(num2);
        result.print();
    }
}

class NewComplex {
    int a, b;

    public NewComplex(int real) {
        a = real;
        b = 12;
    }

    public NewComplex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void print() {
        System.out.println(a + " + " + b + "i");
    }

    NewComplex add(NewComplex num2) {
        this.print();
        return new NewComplex(a + num2.b, b + num2.b);
    }
}

