package loop;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a Number: ");
//        int n = sc.nextInt();

//        for (int i=1; i<10; i++) {
//            System.out.println(n + " * " + i + " = " + n * i);
//        }

        // Sum of N natural numbers
//        int sum = 0;
//
//        for (int i=1; i<=n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        // While loops

//        while (n > 0) {
//            System.out.println("Hello World");
//            n--;
//        }

//        boolean hasLearnt = false;
//
//        while (!hasLearnt) {
//            System.out.println("Went to school, tried to Learn");
//
//            System.out.println("Have you understood?");
//            hasLearnt = sc.nextBoolean();
//        }

        // Pattern Printing
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            boolean flag = true;
            String str = "";
            for (int j=0; j<i; j++) {
                if (flag == true) {
                    str += "1 ";
                    flag = false;
                } else {
                    str += "0 ";
                    flag = true;
                }
            }
            System.out.println(str);
        }
    }
}
