package basics;

public class conditionalStatements {
    public static void main(String[] args) {

//        int age = 4;
//        if (age >= 18) {
//            System.out.println("Eligible to Vote");
//        } else {
//            System.out.println("Not Eligible to Vote");
//        }
//        System.out.println("This will work always.");
//        System.out.println(age >= 18 ? "Eligible to Vote" : "Not Eligible to Vote");

        // You are given three numbers, find the maximum number

        int a = 4;
        int b = 8;
        int c = 1;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
