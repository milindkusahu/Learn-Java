package basics; /**
 * IntelliJ Shortcut:
 * -> sout
 * -> psvm
 */

/**
 * Java Data Types:
 * int -> 4 bytes/ 32 bits
 * float -> 4 bytes/ 32 bits
 * char -> 2 bytes/ 16 bits
 * boolean -> 1 bit
 * byte -> 1 bytes/ 8 bits
 * short -> 2 bytes/ 16 bits
 * long -> 8 bytes/ 64 bits
 * double -> 8 bytes/ 64 bits
 */

public class Hello {
    public static void main(String[] args) {
        boolean isPassed = true;
        byte marks = 13;
        short studentsCount = 1235;

        float pi = 3.14f;
        double secondPi = 3.14;

        System.out.println(marks);

        char myLetter = 'A';
        System.out.println(myLetter);

        // Data Type Implicit Conversion
        int count = 12;
        long newCount = count;


        // Data Type Explicit Conversion
        int age = 26;
        byte newAge = (byte)age; // Data Casting
        System.out.println(newAge);
    }
}