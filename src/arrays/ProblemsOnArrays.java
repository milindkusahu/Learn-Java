package arrays;

public class ProblemsOnArrays {
    public static void main(String[] args) {

        int numbers[] = {23,12,6,7,15,3,2,56};

//        Calculate sum
//        int sum = 0;

//        for (int i=0; i<numbers.length; i++) {
//            sum += numbers[i];
//        }

//        for (int number : numbers) {
//            sum += number;
//        }
//        System.out.println(sum);

//        Find minimum number in an array
//        int min = numbers[0]; // or Integer.MAX_VALUE;
//        for (int number : numbers) {
//            if (number < min) {
//                min = number;
//            }
//        }
//        System.out.println(min);

//        Multi-dimensional Array
        /*
        int marks[][] = new int[4][3];

        marks[0][0] = 12;
        marks[0][1] = 98;
        marks[0][2] = 34;

        marks[1][0] = 12;
        marks[1][1] = 67;
        marks[1][2] = 87;
         */

        int marks[][] = {
                {12,98,34},
                {22,67,87},
                {98,37,65},
                {34,87,16}
        };

        System.out.println(marks[2][1]);
        System.out.println(marks[2][2]);
        System.out.println(marks[1][2]);
    }
}
