package arrays;

public class BasicsOfArray {
    public static void main(String[] args) {
//        Example: 1
//        int age[] = new int[6];
//        age[0] = 5;
//        age[1] = 2;
//
//        System.out.println(age.length);

//        Example: 2
//        int marks[] = {98,12,45,12,64};
//        System.out.println(marks[1]);

//        Example: 3
        String names[] = {"Ram", "Harish", "Karan", "Monty"};

//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        // for-each loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
