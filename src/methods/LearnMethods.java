package methods;

public class LearnMethods {
    public static void main(String[] args) {
        int avg = average(4, 6);
        System.out.println(avg);
    }

    public static int average(int a, int b) {
        int avg = (a+b)/2;
        return avg;
    }

}
