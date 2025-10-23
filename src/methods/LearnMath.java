package methods;

public class LearnMath {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;

        System.out.println(Math.max(a, b));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.abs(-3));
        System.out.println(getRandom(3, 6));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.ceil(5.9));
        System.out.println(Math.round(5.9));
    }

    public static int getRandom(int a, int b) {
//        return (int) (Math.random() * 6) + 1;
        return (int) (Math.random()*(b-a+1) + a);
    }
}
